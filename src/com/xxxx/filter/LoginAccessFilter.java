package com.xxxx.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("/*")

/*
非法访问拦截
       拦截所有资源放行指定页面
*/
public class LoginAccessFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter log working");
//
//        基于Http请求：
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

//        获取请求路径
        String url = request.getRequestURI();
//        使用tag 记录登录登录状态
        String tag = (String) request.getSession().getAttribute("isLogin");
        System.out.println(tag);
////        指定放行页面
        if (url.contains("login.jsp")) {
            System.out.println("1");
            filterChain.doFilter(request, response);

            return;
        }

        if (url.contains("jquery")) {
            System.out.println("jquery");
            filterChain.doFilter(request, response);

            return;
        }
        if (url.contains("css")) {
            System.out.println("css");
            filterChain.doFilter(request, response);

            return;
        }
        if (url.contains("bootstrap")) {
            System.out.println("bootstrap");
            filterChain.doFilter(request, response);

            return;
        }

        if (url.contains("js")) {
            System.out.println("js");
            filterChain.doFilter(request, response);

            return;
        }

        if (url.contains("style.css")) {
            System.out.println("style");
            filterChain.doFilter(request, response);
            return;
        }
        if (url.contains("text")) {
            System.out.println("text");
            filterChain.doFilter(request, response);
            return;
        }
        if (url.contains("asset")) {
            System.out.println("style");
            filterChain.doFilter(request, response);
            return;
        }
//
//        if (url.contains("/vue")) {
//            System.out.println("2");
//            filterChain.doFilter(request, response);
////            request.getRequestDispatcher("index.jsp").forward(request, response);
//            return;
//        }
//
        if (url.contains("login")) {
            System.out.println("3");
            filterChain.doFilter(request, response);
//            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
//
//
        if (tag != null) {
            System.out.println("4");
            filterChain.doFilter(request, response);
//            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
//        System.out.println(tag);
//       未登录时跳转到登陆界面
        response.sendRedirect("login.jsp");

    }
}
