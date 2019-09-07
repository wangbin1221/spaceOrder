package com.example.imeeting.core.http;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class BaseRespones<T> {
    T data;
    public String result;

    public T getData() {
        return data;
    }

    public String getResult() {
        return result;
    }
}
