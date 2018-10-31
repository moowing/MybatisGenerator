package com.xiguaLab.ssm.pojo;

public class User {
    private String userid;

    private String username;

    private String realname;

    private String password;

    private String imgurl;

    private String school;

    private String major;

    private String education;

    private String phone;

    private String email;

    private String wechat;

    private String advantages;

    private Integer projectcount;

    private String projectdoing;

    private String projectdone;

    private String link;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages == null ? null : advantages.trim();
    }

    public Integer getProjectcount() {
        return projectcount;
    }

    public void setProjectcount(Integer projectcount) {
        this.projectcount = projectcount;
    }

    public String getProjectdoing() {
        return projectdoing;
    }

    public void setProjectdoing(String projectdoing) {
        this.projectdoing = projectdoing == null ? null : projectdoing.trim();
    }

    public String getProjectdone() {
        return projectdone;
    }

    public void setProjectdone(String projectdone) {
        this.projectdone = projectdone == null ? null : projectdone.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }
}