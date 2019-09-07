package com.example.imeeting.modules.login.model;

/**
 * description:
 * created by wangbin on 2019/7/13
 */
public class LoginModel {
    public String appkey;
    public String phone;
    public String zone;
    public String code;

    public LoginModel(String appkey, String phone, String zone, String code) {
        this.appkey = appkey;
        this.phone = phone;
        this.zone = zone;
        this.code = code;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
