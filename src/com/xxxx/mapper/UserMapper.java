package com.xxxx.mapper;

import com.xxxx.pojo.Msg;
import com.xxxx.pojo.Notice;
import com.xxxx.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectall();

//    查询个人用户信息
    User seletByname(String uname);

//查询宿舍成员名字
    List<User> selectByDorm(Integer dormNum);

//   查询某个评论的相关信息
    List<Msg> selectByWhoreceiv(String username);

//查询通知
    List<Notice> selectBytowhere(String towhere);



}
