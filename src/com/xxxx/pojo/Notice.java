package com.xxxx.pojo;

import java.sql.Date;

public class Notice {
    private Integer noticeId;
    private String noticeText;
    private Date  date;
    private String towhere;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeText() {
        return noticeText;
    }

    public void setNoticeText(String noticeText) {
        this.noticeText = noticeText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTowhere() {
        return towhere;
    }

    public void setTowhere(String towhere) {
        this.towhere = towhere;
    }

    @Override
    public String toString() {
        return "notice{" +
                "noticeId=" + noticeId +
                ", noticeText='" + noticeText + '\'' +
                ", date=" + date +
                ", towhere='" + towhere + '\'' +
                '}';
    }
}
