package com.example.imeeting.modules.homepage.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.homepage.contract.Contract;
import com.example.imeeting.modules.homepage.contract.HomePageFragmentContract;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.search.model.Request;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class HomePageFragmentPresenter extends BasePresenter<HomePageFragmentContract.HomePageFragmentIView> implements HomePageFragmentContract.HomePageFragmentIPresenter {
    @Inject
    public HomePageFragmentPresenter(){}
    @Override
    public void getRecommendDatas() {
        addSubscribe(mDataManager.getRecommendDatas()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<RecommendResponse>(){
            @Override
            public void onNext(RecommendResponse o) {
                mView.showRecommendDatas(o.getMeetings());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        }));
    }

    @Override
    public void search(String location, int count, int times) {

    }


}
