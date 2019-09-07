package com.example.imeeting.utils;

import android.content.Context;
import android.util.Log;

import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.core.DataManager;
import com.example.imeeting.modules.login.model.LoginModel;


/**
 * description:
 * created by wangbin on 2019/7/13
 */
public class NetUtils {

    public static String request(Context context,LoginModel model){
        IMeetingApplication  application = (IMeetingApplication)context.getApplicationContext();
        if ( application== null){
            return null;
        }
        DataManager manager = application.mDataManager;
        manager.login(model);
        return null;

    }
}
