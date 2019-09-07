package com.example.imeeting.db;

import java.util.List;

import io.reactivex.Observable;

/**
 * description:
 * created by wangbin on 2019/6/16
 */
public interface DBHelper {
    void delete(String keyword);
    void add(String keyword);
    Observable<List<String>> queryAllHistory();
}
