package com.example.imeeting.di.module;

import android.os.Build;

import com.example.imeeting.BuildConfig;
import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.core.http.api.ApiService;
import com.example.imeeting.core.http.interceptor.NetCacheInterceptor;
import com.example.imeeting.core.http.interceptor.OfflineCacheInterceptor;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
@Module
public class HttpModule {

    @Provides
    @Singleton
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Retrofit.Builder builder, OkHttpClient client){
        return builder.client(client)
                .baseUrl("https://imeeting.jiuze9.com/imeeting_new/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    Retrofit.Builder provideRetrofitBuilder(){
        return new Retrofit.Builder();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkhttpclient(OkHttpClient.Builder builder){
        if (BuildConfig.DEBUG){ //debug模式开启打印
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            builder.addInterceptor(interceptor);
        }
        File cacheFile = new File(IMeetingApplication.getContext().getCacheDir(),"cache");
        Cache cache = new Cache(cacheFile,1024*1024*50);
        builder.addNetworkInterceptor(new NetCacheInterceptor());
        builder.addInterceptor(new OfflineCacheInterceptor());
        builder.cache(cache);
        builder.readTimeout(10,TimeUnit.SECONDS);
        builder.writeTimeout(20,TimeUnit.SECONDS);
        builder.connectTimeout(20,TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(true); // 失败重连开启
        //cookie认证
        builder.cookieJar(new PersistentCookieJar(new SetCookieCache(),
                new SharedPrefsCookiePersistor(IMeetingApplication.getContext())));
        return builder.build();
    }

    @Provides
    @Singleton
    OkHttpClient.Builder provideOkhttpBuilder(){
        return new OkHttpClient.Builder();
    }
}
