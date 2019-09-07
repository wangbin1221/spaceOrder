package com.example.imeeting.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.imeeting.app.IMeetingApplication;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * description:
 * created by wangbin on 2019/6/16
 */
public class DBHelpImp implements DBHelper {


    private IMeetingDBHelper helper;
    private Context context;
    @Inject
    public DBHelpImp(IMeetingDBHelper IMeetingDBHelper){
        this.context = IMeetingApplication.getContext();
        this.helper = IMeetingDBHelper;
    }
    @Override
    public void delete(String keyword) {
        SQLiteDatabase db = helper.getReadableDatabase();
        db.delete("search_story_histroy","keyword=?",new String[]{keyword});
        db.close();
    }

    @Override
    public synchronized void add(String keyword) {
        delete(keyword);
        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("keyword",keyword);
        long rowid = database.insert("search_story_histroy",null,contentValues);
        Log.d("wangbin",String.valueOf(rowid));
        database.close();
    }

    @Override
    public synchronized Observable<List<String>> queryAllHistory() {
        List<String> result = new ArrayList<>();
        SQLiteDatabase database= helper.getWritableDatabase();
        Cursor cursor;
        cursor=(database.query("search_story_histroy",null,null,null,null,null,"id desc"));
        while(cursor.moveToNext()){
            result.add(cursor.getString(1));
        }
        cursor.close();
        database.close();
        return Observable.create(new ObservableOnSubscribe<List<String>>() {
            @Override
            public void subscribe(ObservableEmitter<List<String>> e) throws Exception {
                e.onNext(result);
            }
        });
    }
}
