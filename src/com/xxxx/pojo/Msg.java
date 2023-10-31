package com.xxxx.pojo;

import java.sql.Date;

public class Msg {
    private Integer msgId;
    private String msgText;
    private Date date;
    private String whomark;
    private String whoreceive;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWhomark() {
        return whomark;
    }

    public void setWhomark(String whomark) {
        this.whomark = whomark;
    }

    public String getWhoreceive() {
        return whoreceive;
    }

    public void setWhoreceive(String whoreceive) {
        this.whoreceive = whoreceive;
    }

    @Override
    public String toString() {
        return "msg{" +
                "msgId=" + msgId +
                ", msgText='" + msgText + '\'' +
                ", date=" + date +
                ", whomark='" + whomark + '\'' +
                ", whoreceive='" + whoreceive + '\'' +
                '}';
    }
}
