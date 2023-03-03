package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//generic servlet is child class of servlet interface and http servlet is child class of generic servlet
public class HttpServlets extends HttpServlet {
    //used to create http protocol specific servlet
    //for protocol specific functionality we use the http servlet

    public void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException
    {
        System.out.println("this is get method");
        responce.setContentType("text/html");
        PrintWriter out=responce.getWriter();
//        PrintWriter out=new PrintWriter(responce.getWriter());
        out.println("hello abhijeet from the doGet() method ");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
