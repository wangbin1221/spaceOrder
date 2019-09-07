package com.example.imeeting.core.http;

import com.example.imeeting.core.http.api.ApiService;
import com.example.imeeting.modules.detail.model.CollectResponse;
import com.example.imeeting.modules.detail.model.DetailResponse;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.login.model.LoginModel;
import com.example.imeeting.modules.search.model.LocationResponse;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public interface HttpHelper {
    //public HttpHelper
    Observable<RecommendResponse> getRecommendDatas();
    Observable<RecommendResponse> getAllSpacedatas(Map<String,String> map);
    Observable<LocationResponse> getLocationDatas(String openid,String city);
    Observable<DetailResponse> getDetailResponse(Map<String,String> map);
    Observable<CollectResponse> collect(String openid,String goodid);
    Observable<CollectResponse> uncollect(String openid,String goodid);
    Observable<String> guessLike( String openid);
    Observable<List<StoryResponse>> getStoryList(String openid, String type, String keyword);
    Observable<String> login(LoginModel model);
}
