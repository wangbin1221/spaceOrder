package com.example.imeeting.core.http.interceptor;

import com.example.imeeting.utils.CommonUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class OfflineCacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (!CommonUtils.isNetworkConnected()) {
            int offlineCacheTime = 60 * 60 * 24 * 28;//离线的时候的缓存的过期时间,4周
            request = request.newBuilder()
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + offlineCacheTime)
                    .removeHeader("Pragma")
                    .build();
        }
        return chain.proceed(request);
    }
}
