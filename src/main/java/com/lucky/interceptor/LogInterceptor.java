package com.lucky.interceptor;

import com.lucky.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInterceptor implements HandlerInterceptor {


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        //Handler可以拿到当前请求的方法名，类.....等
        System.out.println("log------>1:-----tip====preHandle===>");
        System.out.println("tip====当前执行的类是:"+handler.getClass());
        System.out.println("tip===="+handler);
        return true;//会终止所有的请求
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("log------>3:-----tip====postHandle===>");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("log------>4--->tip====afterCompletion===>");
    }
}
