package com.lucky.interceptor;

import com.lucky.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        User user = (User)request.getSession().getAttribute("user");
        if(user==null) {
            System.out.println("1:tip--login====preHandle===>");
            response.sendRedirect(request.getContextPath()+"/login");
            return false;//会终止所有的请求
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("3:-----tip==--login==postHandle===>");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println("4-----tip=--login===afterCompletion===>");
    }
}
