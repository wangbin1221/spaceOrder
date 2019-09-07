package com.example.imeeting.modules.story.ui.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.story.contract.StoryFragmentContract;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public class SingleFragmentPresenter extends BasePresenter<StoryFragmentContract.StoryfragmentIView> implements StoryFragmentContract.StroyfragmentIPresenter {
    private String openid = "";
    private String type = "";
    private String keyword = "";

    @Inject
    public SingleFragmentPresenter() {
    }

    @Override
    public void getStoryList(Map<String, String> map) {
        type = map.get(Constants.TYPE);
        keyword = map.get(Constants.KEY_WORD) == null ? "" : map.get(Constants.KEY_WORD);
        addSubscribe(mDataManager.getStoryList(openid, type, keyword)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new ResourceObserver<List<StoryResponse>>() {
                    @Override
                    protected void onStart() {
                        super.onStart();
                        mView.showLoading();
                    }

                    @Override
                    public void onNext(List<StoryResponse> storyResponses) {
                        mView.hideLoading();
                        mView.showContent();
                        mView.showStoryList(storyResponses);
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
