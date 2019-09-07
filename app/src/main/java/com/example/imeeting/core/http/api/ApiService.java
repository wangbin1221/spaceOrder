package com.example.imeeting.core.http.api;

import com.example.imeeting.core.rx.BaseObserver;
import com.example.imeeting.modules.detail.model.CollectResponse;
import com.example.imeeting.modules.detail.model.DetailResponse;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.login.model.LoginModel;
import com.example.imeeting.modules.search.model.LocationResponse;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public interface ApiService {
    @GET("index.php?s=/Home/Index/recommendmeeting")
    Observable<RecommendResponse> getRecommendDatas();

    @GET("index.php/Home/Index/indexmeeting")
    Observable<RecommendResponse> getAllSpacedatas(@QueryMap() Map<String, String> map);

    @GET("index.php?s=/Home/Index/attr")
    Observable<LocationResponse> getRecommentLocation(@Query("openid") String openid, @Query("city") String city);

    @GET("index.php/Home/Index/detail")
    Observable<DetailResponse> getDetailResponse(@QueryMap() Map<String, String> map);

    @GET("index.php?s=/Home/Index/fav")
    Observable<CollectResponse> collect(@Query("openid") String openid, @Query("goodid") String goodid);

    @GET("index.php?s=/Home/Index/unfav")
    Observable<CollectResponse> uncollect(@Query("openid") String openid, @Query("goodid") String goodid);

    @GET("index.php?s=/Home/Index/guessyoulikeforstory")
    Observable<String> guessLike(@Query("openid") String openid);

    @GET("index.php?s=/Home/Index/storylist")
    Observable<List<StoryResponse>> getStoryList(@Query("openid")String openid, @Query("type") String type, @Query("keyword") String keyword);

    @POST("http://47.112.36.3/imeeting/login/phone")
    Observable<String> login(@Body LoginModel model);
}
