package com.example.imeeting.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.imeeting.app.IMeetingApplication;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/16
 */
public class IMeetingDBHelper extends SQLiteOpenHelper {
    @Inject
    public IMeetingDBHelper(){
        this(IMeetingApplication.getContext(),"imeeting.db",null,1);
    }
    public IMeetingDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public IMeetingDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table search_story_histroy(id integer primary key autoincrement,keyword varchar(20))"
        );
        Log.d("wangbin","db create");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("wangbin","onUpgrade + oldVersion: " + oldVersion + "newVersion: " + newVersion);
        switch (oldVersion) {
            case 2:
                db.execSQL(
                        "create table contactinfo2 (" +
                                "id integer primary key autoincrement, " +
                                "keyword varchar(20))"
                );   // 判断版本号.如果是老版本, 走upgrade逻辑,创建新的表
                break;
            case 3:
                db.execSQL("alter table contactinfo add category_id integer");
            default:

        }
    }
}
