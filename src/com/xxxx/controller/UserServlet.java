package com.xxxx.controller;


import com.xxxx.pojo.vo.MessageModel;
import com.xxxx.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class UserServlet extends HttpServlet {


    //    实例化UserService对象
    private UserService userService = new UserService();


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF8");
        resp.setContentType("text/html; charset=UTF8");
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        System.out.println("servlet working");
        MessageModel messageModel = userService.userLogin(uname, upwd);
        System.out.println("servlet working back");
        if (messageModel.getStatusCode() == 1) {
            System.out.println("turn to index");
            req.getSession().setAttribute("user", messageModel.getObject());
            req.getSession().setAttribute("isLogin", uname);
            resp.sendRedirect("index.html");
        } else {
            req.setAttribute("messageModel", messageModel);
            req.getRequestDispatcher("login.jsp").forward(req, resp);

        }
    }
}
