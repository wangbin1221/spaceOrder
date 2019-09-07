package com.example.imeeting.core;

import com.example.imeeting.core.http.HttpHelper;
import com.example.imeeting.core.preference.PreferenceHelper;
import com.example.imeeting.db.DBHelper;
import com.example.imeeting.modules.detail.model.CollectResponse;
import com.example.imeeting.modules.detail.model.DetailResponse;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.login.model.LoginModel;
import com.example.imeeting.modules.search.model.LocationResponse;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * description: 管理app所有的信息，包括网络请求和preference
 * created by wangbin on 2019/6/3
 */
public class DataManager implements HttpHelper,PreferenceHelper,DBHelper {
    @Override
    public Observable<String> login(LoginModel model) {
        return httpHelper.login(model);
    }

    @Override
    public void delete(String keyword) {
        dbHelper.delete(keyword);
    }

    @Override
    public void add(String keyword) {
        dbHelper.add(keyword);
    }

    @Override
    public Observable<List<String>> queryAllHistory() {
        return dbHelper.queryAllHistory();
    }

    @Override
    public Observable<List<StoryResponse>> getStoryList(String openid, String type, String keyword) {
        return httpHelper.getStoryList(openid,type,keyword);
    }

    @Override
    public Observable<String> guessLike(String openid) {
        return httpHelper.guessLike(openid);
    }

    @Override
    public Observable<CollectResponse> collect(String openid, String goodid) {
        return httpHelper.collect(openid,goodid);
    }

    @Override
    public Observable<CollectResponse> uncollect(String openid, String goodid) {
        return httpHelper.uncollect(openid,goodid);
    }

    @Override
    public Observable<DetailResponse> getDetailResponse(Map<String, String> map) {
        return httpHelper.getDetailResponse(map);
    }

    @Override
    public void setOpenid(String openid) {
        preferenceHelper.setOpenid(openid);
    }

    @Override
    public String getOpenid() {
        return preferenceHelper.getOpenid();
    }

    @Override
    public void setChooseCity(String city) {
        preferenceHelper.setChooseCity(city);
    }

    @Override
    public String getCity() {
        return preferenceHelper.getCity();
    }

    @Override
    public Observable<LocationResponse> getLocationDatas(String openid, String city) {
        return httpHelper.getLocationDatas(openid,city);
    }

    private HttpHelper httpHelper;
    private PreferenceHelper preferenceHelper;
    private DBHelper dbHelper;
    public DataManager(HttpHelper httpHelper,PreferenceHelper preferenceHelper,DBHelper dbHelper){
        this.httpHelper = httpHelper;
        this.preferenceHelper = preferenceHelper;
        this.dbHelper = dbHelper;
    }

    @Override
    public Observable<RecommendResponse> getAllSpacedatas(Map<String, String> map) {
        return httpHelper.getAllSpacedatas(map);
    }

    @Override
    public void setLoginStatus(boolean isLogin) {

    }

    @Override
    public boolean getLoginStatus() {
        return false;
    }

    @Override
    public void setLoginAccount(String account) {

    }

    @Override
    public Observable<RecommendResponse> getRecommendDatas() {
        return httpHelper.getRecommendDatas();
    }

    @Override
    public String getLoginAccount() {
        return null;
    }

    @Override
    public void setNightMode(boolean isNightMode) {

    }

    @Override
    public boolean isNightMode() {
        return false;
    }
}
