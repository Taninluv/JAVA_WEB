package com.xxxx.test;

import com.xxxx.mapper.UserMapper;
import com.xxxx.pojo.User;
import com.xxxx.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession= GetSqlSession.createSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//        List<User> user = userMapper.selectall();
        User user = userMapper.seletByname("admin");
        System.out.println(user);

    }
}
