package com.xiguaLab.ssm.pojo;

public class Message {
    private String messageid;

    private String messagecontent;

    private String messagetime;

    private String messagecategory;

    private String messagefrom;

    private String messageto;

    private Integer messagestatus;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime == null ? null : messagetime.trim();
    }

    public String getMessagecategory() {
        return messagecategory;
    }

    public void setMessagecategory(String messagecategory) {
        this.messagecategory = messagecategory == null ? null : messagecategory.trim();
    }

    public String getMessagefrom() {
        return messagefrom;
    }

    public void setMessagefrom(String messagefrom) {
        this.messagefrom = messagefrom == null ? null : messagefrom.trim();
    }

    public String getMessageto() {
        return messageto;
    }

    public void setMessageto(String messageto) {
        this.messageto = messageto == null ? null : messageto.trim();
    }

    public Integer getMessagestatus() {
        return messagestatus;
    }

    public void setMessagestatus(Integer messagestatus) {
        this.messagestatus = messagestatus;
    }
}