package com.example.imeeting.modules.story.presenter;

import android.util.Log;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.story.contract.SearchStoryActivityContract;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * description:
 * created by wangbin on 2019/6/14
 */
public class StorySearchPresenter extends BasePresenter<SearchStoryActivityContract.SearchStoryIview> implements SearchStoryActivityContract.SearchStoryIPresenter {
    @Inject
    public StorySearchPresenter(){}

    @Override
    public void getGuesslike() {
        addSubscribe(mDataManager.guessLike("")
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<String>(){
            @Override
            public void onNext(String s) {
                Log.d("wangbin",s);
                List<String> list = new ArrayList<>();
                String[] ss = s.split(",");
                list = Arrays.asList(ss);
                mView.showGuesslike(list);
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
    public void getSearchhistory() {
        addSubscribe(mDataManager.queryAllHistory()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<List<String>>(){
            @Override
            public void onNext(List<String> strings) {
                mView.showSearchHistory(strings);
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
    public void searchWithKey(String type, String key) {
        addSubscribe(mDataManager.getStoryList("",type,key)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new ResourceObserver<List<StoryResponse>>(){
            @Override
            public void onNext(List<StoryResponse> responses) {
                mView.showSearchResult(responses);
            }

            @Override
            public void onError(Throwable e) {
                mView.showSearchResult(null);
            }

            @Override
            public void onComplete() {
            }

        }));
        getSearchhistory();
    }

    @Override
    public void add(String s) {
        new Thread(){
            @Override
            public void run() {
                mDataManager.add(s);
            }
        }.start();
    }
}
