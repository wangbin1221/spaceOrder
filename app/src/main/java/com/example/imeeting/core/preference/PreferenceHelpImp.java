package com.example.imeeting.core.preference;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.core.constant.Constants;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class PreferenceHelpImp implements PreferenceHelper {
    private final SharedPreferences mPreferences;

    @Inject
    public PreferenceHelpImp() {
        mPreferences = IMeetingApplication.getContext().getSharedPreferences(Constants.IMEETING_SHARED_PREFERENCE, Context.MODE_PRIVATE);
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mPreferences.edit().putBoolean(Constants.LOGIN_STATUS, isLogin).apply();
    }

    @Override
    public boolean getLoginStatus() {
        return mPreferences.getBoolean(Constants.LOGIN_STATUS, false);
    }

    @Override
    public void setLoginAccount(String account) {
        mPreferences.edit().putString(Constants.ACCOUNT, account).apply();
    }

    @Override
    public String getLoginAccount() {
        return mPreferences.getString(Constants.ACCOUNT, "");
    }

    @Override
    public void setNightMode(boolean isNightMode) {
        mPreferences.edit().putBoolean(Constants.NIGHT_MODE, isNightMode).apply();
    }

    @Override
    public boolean isNightMode() {
        return mPreferences.getBoolean(Constants.NIGHT_MODE, false);
    }

    @Override
    public void setOpenid(String openid) {
        mPreferences.edit().putString(Constants.OPEN_ID,openid).apply();
    }

    @Override
    public String getOpenid() {
        return mPreferences.getString(Constants.OPEN_ID,"");
    }

    @Override
    public void setChooseCity(String city) {
        mPreferences.edit().putString(Constants.CITY,city).apply();
    }

    @Override
    public String getCity() {
        return mPreferences.getString(Constants.CITY,"南京");
    }
}
