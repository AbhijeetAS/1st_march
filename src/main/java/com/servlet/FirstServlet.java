package com.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet {
    ServletConfig config;
    @Override()
    public void init(ServletConfig Config) throws ServletException {

        this.config=Config;
        System.out.println("hello from the init method");
    }

    @Override()
    public void service(ServletRequest Request, ServletResponse Response) throws ServletException, IOException {

        System.out.println("hello from the service method");
        Response.setContentType("text/html");
        PrintWriter out=Response.getWriter();
        out.println("<h1>hello abhijeet</h1>");
    }

    @Override()
    public void destroy() {
        System.out.println("hello from the destroy method");
    }

    public ServletConfig getServletConfig() {
        return null;
    }



    public String getServletInfo() {
        return null;
    }


}
