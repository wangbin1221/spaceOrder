package com.example.imeeting.modules.search.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.search.contract.SearchLocationActivityContract;
import com.example.imeeting.modules.search.model.LocationResponse;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public class SearchLocationPresenter extends BasePresenter<SearchLocationActivityContract.SearchLocatonIView> implements SearchLocationActivityContract.SearchLocationPresenter {
    @Inject
    public SearchLocationPresenter(){}
    @Override
    public void getlocationData(String openId, String city) {
        addSubscribe(mDataManager.getLocationDatas(openId,city)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<LocationResponse>(){

            @Override
            public void onNext(LocationResponse response) {
                mView.showContent();
                mView.showLocationData(response);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }

            @Override
            protected void onStart() {
                super.onStart();
                mView.showLoading();
            }
        }));
    }
}
