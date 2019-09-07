package com.example.imeeting.modules.detail.model;

import java.io.Serializable;

/**
 * description:
 * created by wangbin on 2019/6/9
 */
public class DetailRequest implements Serializable {

    /**
     * id : detailID
     * openid : app.globalData.openid
     * lat : app.globalData.lat
     * lng : app.globalData.lng
     * channel : page.data.channel
     * shareopenid : page.data.shareopenid
     */

    private String id;
    private String openid;
    private String lat;
    private String lng;
    private String channel;
    private String shareopenid;
    public DetailRequest(){}
    public DetailRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getShareopenid() {
        return shareopenid;
    }

    public void setShareopenid(String shareopenid) {
        this.shareopenid = shareopenid;
    }
}
