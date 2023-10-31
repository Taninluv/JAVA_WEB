package com.xxxx.pojo.vo;
/*
* 消息模型对象
* */
public class MessageModel {
    private Integer statusCode=1;
    private String  msg="login successfully!";
    private Object  object;//回显对象

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "statusCode=" + statusCode +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
