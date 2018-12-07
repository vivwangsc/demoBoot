package com.example.demo.web;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Order(1)
@javax.servlet.annotation.WebFilter(filterName = "WebFilter",urlPatterns = "/*")
public class WebFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse)resp;
        String basePath = request.getContextPath();
        System.out.println("hello from filter!");
        System.err.println("hello from filter!");
        System.out.println(request.getServletPath());
        System.err.println(request.getServletPath());
        request.setAttribute("basePath", basePath);
        String parentPath = request.getRequestURI();
        request.setAttribute("parentPath", parentPath);
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("I am init from spring mvc");

    }

}
