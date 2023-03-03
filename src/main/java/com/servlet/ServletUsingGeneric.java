package com.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletUsingGeneric extends GenericServlet{
    //Genric servelet is abstract class which comes from the jakarta.servlet package

    @Override
    public void service(ServletRequest Request, ServletResponse Response) throws ServletException, IOException {

        System.out.println("this is servlet using generic servlet");
        Response.setContentType("text/html");
        PrintWriter out=Response.getWriter();
        out.println("Abhijeet is good boy");
    }



}
