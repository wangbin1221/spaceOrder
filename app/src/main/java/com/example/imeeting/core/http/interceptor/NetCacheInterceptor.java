package com.example.imeeting.core.http.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class NetCacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        int onlineCacheTime = 0;//在线的时候的缓存过期时间，如果想要不缓存，直接时间设置为0
        return response.newBuilder()
                .header("Cache-Control", "public, max-age="+onlineCacheTime)
                .removeHeader("Pragma")
                .build();
    }
}
