package com.servlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("my servlet is running");
        resp.setContentType("text/html");
        String salutaion=req.getParameter("salutation");
        resp.getWriter().println(salutaion);
        String FirstName=req.getParameter("firstName");
        resp.getWriter().println("First name is "+FirstName+"<br>");
        String LastName=req.getParameter("lastName");
        resp.getWriter().println("Last name is "+LastName+"<br>");
        String Gender=req.getParameter("gender");
        resp.getWriter().println("gender is "+Gender+"<br>");
        String Email=req.getParameter("email");
        resp.getWriter().println("email is "+Email+"<br>");
        String DOB=req.getParameter("birthDate");
        resp.getWriter().println(DOB+"<br>");
        resp.getWriter().println("<h1> thanks for filling the form</h1>");



    }

}
