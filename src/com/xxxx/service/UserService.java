package com.xxxx.service;

import com.xxxx.mapper.UserMapper;
import com.xxxx.pojo.User;
import com.xxxx.pojo.vo.MessageModel;
import com.xxxx.util.GetSqlSession;
import com.xxxx.util.StringUtil;
import org.apache.ibatis.session.SqlSession;

public class UserService {
    public MessageModel userLogin(String uname, String upwd) {
        MessageModel messageModel = new MessageModel();


//        回显数据
        User u = new User();
        u.setUserName(uname);
        u.setUserPwd(upwd);
        messageModel.setObject(u);
        System.out.println("service working");


        if (StringUtil.isEmpty(uname) || StringUtil.isEmpty(upwd)) {
            messageModel.setStatusCode(0);
            messageModel.setMsg("用户名和密码不能为空");
            //回显数据
//            User u =new User();
//            u.setUserName(uname);
//            u.setUserPwd(upwd);
            return messageModel;
        }

        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.seletByname(uname);
        System.out.println(user.toString());

        if (user == null) {
            messageModel.setStatusCode(0);
            messageModel.setMsg("用户不存在");
            System.out.println("用户不存在");
            //回显数据
//            User u =new User();
//            u.setUserName(uname);
//            u.setUserPwd(upwd);
            return messageModel;
        }

        if (!upwd.equals(user.getUserPwd())) {
            messageModel.setStatusCode(0);
            messageModel.setMsg("密码错误");
            System.out.println("密码错误");
            return messageModel;
        }

//        登录成功

        messageModel.setObject(user);
        return messageModel;


    }


}
