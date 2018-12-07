package com.example.demo.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * filter过滤器，获取项目路径，设置ajax超时标识
 *
 * @author billJiang QQ:475572229
 */
public class SystemFilter implements Filter {
    private static List<String> anonlist;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException,
            ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String basePath = request.getContextPath();
        System.out.println(request.getServletPath());
        request.setAttribute("basePath", basePath);
        String parentPath = getParent(request.getRequestURI());
        request.setAttribute("parentPath", parentPath);
        filterChain.doFilter(request, servletResponse);
    }

    private String getParent(String resourcePath) {
        int index = resourcePath.lastIndexOf('/');
        if (index > 0) {
            return resourcePath.substring(0, index);
        }
        return "/";
    }

    @Override
    public void destroy() {

        // TODO Auto-generated method stub

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

        // TODO Auto-generated method stub

    }
}
