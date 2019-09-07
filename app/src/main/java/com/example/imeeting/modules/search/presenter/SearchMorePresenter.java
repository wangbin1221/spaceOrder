package com.example.imeeting.modules.search.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.search.contract.Contract;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class SearchMorePresenter extends BasePresenter<Contract.SearchIView> implements Contract.SearchIPresenter {
    @Inject
    public SearchMorePresenter(){}
    private Map<String,String> map ;
    @Override
    public void search(Map<String, String> map) {
        this.map = map;
        addSubscribe(mDataManager.getAllSpacedatas(map)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<RecommendResponse>(){
            @Override
            protected void onStart() {
                super.onStart();
                mView.showLoading();
            }

            @Override
            public void onNext(RecommendResponse recommendResponse) {
                mView.hideLoading();
                mView.showContent();
                mView.showDatas(recommendResponse.getMeetings());
            }

            @Override
            public void onError(Throwable e) {
                mView.hideLoading();
                mView.showContent();
            }

            @Override
            public void onComplete() {

            }
        }));
    }

    @Override
    public void reload() {
        if (map == null){
            return;
        }
        search(map);

    }
}
