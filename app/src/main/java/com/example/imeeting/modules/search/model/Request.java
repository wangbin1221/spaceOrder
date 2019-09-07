package com.example.imeeting.modules.search.model;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class Request {

    /**
     * city : page.data.currentcity
     * lng : page.data.lng
     * lat : page.data.lat
     * openid : app.globalData.openid
     * page : page.data.searchPageNum
     * sortflag : sortby
     * address : address
     * date : app.globalData.orderdate
     * timebegin : starttimecopy
     * timeend : endtimecopy
     * keyword : page.data.keyword
     * number : app.globalData.number
     * price : page.data.price
     * tags : page.data.tags
     * goodstypewords : page.data.goodstypewords
     * recommend : page.data.recommend
     * kind : page.data.pres
     */

    private String city;
    private String lng;
    private String lat;
    private String openid;
    private String page;
    private String sortflag;
    private String address;
    private String date;
    private String timebegin;
    private String timeend;
    private String keyword;
    private String number;
    private String price;
    private String tags;
    private String goodstypewords;
    private String recommend;
    private String kind;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getSortflag() {
        return sortflag;
    }

    public void setSortflag(String sortflag) {
        this.sortflag = sortflag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimebegin() {
        return timebegin;
    }

    public void setTimebegin(String timebegin) {
        this.timebegin = timebegin;
    }

    public String getTimeend() {
        return timeend;
    }

    public void setTimeend(String timeend) {
        this.timeend = timeend;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getGoodstypewords() {
        return goodstypewords;
    }

    public void setGoodstypewords(String goodstypewords) {
        this.goodstypewords = goodstypewords;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
