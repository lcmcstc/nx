package com.example.demo.controller.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:过滤器
 * @author: GavenLee
 * @time: 2020/10/20 9:53
 */
@Component
public class CorsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest reqs = (HttpServletRequest) req;
        String curOrigin = reqs.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", "*");
        chain.doFilter(req, res);
    }


    @Override
    public void init(FilterConfig filterConfig) {
        //System.out.println("=======================================================跨域配置完成=================================================");
    }

    @Override
    public void destroy() {}

}
