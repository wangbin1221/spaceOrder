package com.example.imeeting.core.http;

import com.example.imeeting.core.http.api.ApiService;
import com.example.imeeting.modules.detail.model.CollectResponse;
import com.example.imeeting.modules.detail.model.DetailResponse;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.login.model.LoginModel;
import com.example.imeeting.modules.search.model.LocationResponse;
import com.example.imeeting.modules.story.model.StoryResponse;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class HttpHelpImp implements HttpHelper{
    @Override
    public Observable<String> login(LoginModel model) {
        return apiService.login(model);
    }

    @Override
    public Observable<List<StoryResponse>> getStoryList(String openid, String type, String keyword) {
        return apiService.getStoryList(openid,type,keyword);
    }

    @Override
    public Observable<String> guessLike(String openid) {
        return apiService.guessLike(openid);
    }

    @Override
    public Observable<CollectResponse> collect(String openid, String goodid) {

        return apiService.collect(openid,goodid);
    }

    @Override
    public Observable<CollectResponse> uncollect(String openid, String goodid) {
        return apiService.uncollect(openid,goodid);
    }

    @Override
    public Observable<DetailResponse> getDetailResponse(Map<String, String> map) {
        return apiService.getDetailResponse(map);
    }

    @Override
    public Observable<LocationResponse> getLocationDatas(String openid, String city) {
        return apiService.getRecommentLocation(openid, city);

    }

    private ApiService apiService;
    @Inject
    public HttpHelpImp(ApiService service){
        this.apiService= service;
    }

    @Override
    public Observable<RecommendResponse> getRecommendDatas() {
        return apiService.getRecommendDatas();
    }

    @Override
    public Observable<RecommendResponse> getAllSpacedatas(Map<String, String> map) {
        return apiService.getAllSpacedatas(map);
    }
}
