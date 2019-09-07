package com.example.imeeting.core.rx;

import android.support.annotation.CallSuper;
import android.text.TextUtils;
import android.util.Log;

import com.example.imeeting.R;
import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.core.http.BaseRespones;
import com.example.imeeting.utils.CommonUtils;

import io.reactivex.observers.ResourceObserver;
import retrofit2.HttpException;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public abstract class BaseObserver<T> extends ResourceObserver<BaseRespones<T>> {
    private static final String TAG = "BaseObserver";

    private IView mView;
    private String mErrorMsg;
    private boolean isShowStatusView = true;

    protected BaseObserver(IView view) {
        this.mView = view;
    }

    protected BaseObserver(IView view, String errorMsg) {
        this.mView = view;
        this.mErrorMsg = errorMsg;
    }

    protected BaseObserver(IView view, boolean isShowStatusView) {
        this.mView = view;
        this.isShowStatusView = isShowStatusView;
    }

    protected BaseObserver(IView view, String errorMsg, boolean isShowStatusView) {
        this.mView = view;
        this.mErrorMsg = errorMsg;
        this.isShowStatusView = isShowStatusView;
    }

    @Override
    public void onNext(BaseRespones<T> baseResponse) {
        if (baseResponse.result.equals("success")) {
            Log.d(TAG, "onSuccess");
            if (isShowStatusView) {
                mView.hideLoading();
                mView.showContent();
            }
            onSuccess(baseResponse.getData());
        } else {
            Log.d(TAG, "onFailure");
            if (isShowStatusView) {
                mView.hideLoading();
                mView.showContent();
            }
            onFailure(1, "error");
        }
    }

    @Override
    public void onError(Throwable e) {
        Log.d(TAG, "onError");
        if (mView == null) {
            return;
        }
        if (isShowStatusView) {
            mView.hideLoading();
        }
        if (e instanceof HttpException) {
            mView.showErrorMsg(IMeetingApplication.getContext().getString(R.string.http_error));
            if (isShowStatusView) {
                mView.showNoNetwork();
            }
        } else {
            if (!TextUtils.isEmpty(mErrorMsg)) {
                mView.showErrorMsg(mErrorMsg);
            }
            if (isShowStatusView) {
                mView.showError();
            }
            Log.e(TAG, e.toString());
        }
    }
    public abstract void onSuccess(T t);

    @CallSuper
    public void onFailure(int code, String message) {
        mView.showErrorMsg(message);
    }
    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete");
        if (mView == null) {
            return;
        }
        if (!CommonUtils.isNetworkConnected()) {
            mView.showErrorMsg(IMeetingApplication.getContext().getString(R.string.http_error));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        if (isShowStatusView) {
            mView.showLoading();
        }
    }
}
