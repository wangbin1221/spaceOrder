package com.example.imeeting.modules.story.model;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public class StoryResponse {

    /**
     * id : 127
     * title : 及物艺空间丨浓淡浅深，艺术不过也是生活
     * content :
     * user_id : 管理员
     * create_time : 1555926754
     * update_time : 0
     * status : 0
     * link : http://mp.weixin.qq.com/s?__biz=MzUwOTg4MzM1Ng==&mid=100000714&idx=1&sn=d8696c3f64ced134ba814289dd69a90f&chksm=790a25794e7dac6fba1083b1303701e3fa3f85ecf214e36ca066597c2f17d24d76431c136d13#rd
     * image : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/1548930848.jpg
     * type : 空间故事
     * date : 2019-04-22
     * sort : 88
     */

    private String id;
    private String title;
    private String content;
    private String user_id;
    private String create_time;
    private String update_time;
    private String status;
    private String link;
    private String image;
    private String type;
    private String date;
    private String sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
