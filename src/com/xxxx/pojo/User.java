package com.xxxx.pojo;

import java.lang.invoke.StringConcatFactory;

/*
* User 实体类
* */
public class User {
    private Integer userId;
    private Integer userAge;
    private String userName;
    private String userPwd;

    private Integer isAdmin;
    private Integer dormitoryNum;
    private String teleNum;
    private String e_mail;
    private String todolist;
    private String imgurl;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getDormitoryNum() {
        return dormitoryNum;
    }

    public void setDormitoryNum(Integer dormitoryNum) {
        this.dormitoryNum = dormitoryNum;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getTodolist() {
        return todolist;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAge=" + userAge +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", isAdmin=" + isAdmin +
                ", dormitoryNum=" + dormitoryNum +
                ", teleNum='" + teleNum + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", todolist='" + todolist + '\'' +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
