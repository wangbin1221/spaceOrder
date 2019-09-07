package com.example.imeeting.modules.detail.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.detail.Contract;
import com.example.imeeting.modules.detail.model.DetailResponse;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * description:
 * created by wangbin on 2019/6/9
 */
public class DetailPresenter extends BasePresenter<Contract.DetailIView> implements Contract.DetailIPresenter {
   @Inject
   public DetailPresenter(){}
    @Override
    public void getDetailData(Map<String, String> request) {
        addSubscribe(mDataManager.getDetailResponse(request)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<DetailResponse>(){
            @Override
            protected void onStart() {
                super.onStart();
                mView.showLoading();
            }

            @Override
            public void onNext(DetailResponse response) {
                mView.hideLoading();;
                mView.showContent();
                mView.showDetailData(response);
            }

            @Override
            public void onError(Throwable e) {
                mView.showError();
            }

            @Override
            public void onComplete() {

            }
        }));
    }

}
