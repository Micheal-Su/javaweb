package com.bjpowernode.javaweb.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Sujunbin
 * @create 2022/10/31 13:01
 */
public class DoGetAndPostServlet extends HttpServlet {
//    githubtestaa
//     edit on github
//    hot_fix
//    local hot
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("this is doGet Method,the servlet is created by IntelliJ IDEA");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("this is doPost Method");

    }
}
