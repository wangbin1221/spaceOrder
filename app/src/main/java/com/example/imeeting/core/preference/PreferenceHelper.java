package com.example.imeeting.core.preference;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public interface PreferenceHelper {
    void setLoginStatus(boolean isLogin);
    boolean getLoginStatus();

    void setLoginAccount(String account);
    String getLoginAccount();

    void setNightMode(boolean isNightMode);
    boolean isNightMode();

    void setOpenid(String openid);
    String getOpenid();

    void setChooseCity(String city);
    String getCity();
}
