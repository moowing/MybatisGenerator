package com.xiguaLab.ssm.pojo;

public class Questions {
    private String id;

    private String content;

    private String username;

    private String userid;

    private String userimg;

    private Integer numOfReview;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public Integer getNumOfReview() {
        return numOfReview;
    }

    public void setNumOfReview(Integer numOfReview) {
        this.numOfReview = numOfReview;
    }
}