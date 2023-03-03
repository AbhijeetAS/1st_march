package com.servlet;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig Config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain Chain) throws IOException, ServletException
    {
        System.out.println("before filter");
        /* ***************
        ************operetion perform here before request reaching the servlet
         */
        Chain.doFilter(Request,Response);
        System.out.println("after filter");
    }

    @Override
    public void destroy() {

    }
}
