package com.lucky.controller;

import com.lucky.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    //查询用户
    @RequestMapping("/search")
    public String search(HttpSession session){
        //进行登录拦截：但是模块过多，需要写过多登录判断
//        User user = (User) session.getAttribute("user");
//        if (user == null) return "login";
        System.out.println("2:----tip====---search---");
        return  "user/search";
    }


    //查询用户
    @RequestMapping("/updatepwd")
    public String updatepwd(HttpSession session){
        System.out.println("2:tip====---updatepwd---");
        return  "user/updatepwd";
    }


    //查询用户
    @RequestMapping("/updateheaderPic")
    public String updateheaderPic(HttpSession session){
        System.out.println("2:tip====---updateheaderPic");
        return  "user/updateheaderPic";
    }

    //查询用户
    @RequestMapping("/updatebackground/{id}")
    public String updatebackground(HttpSession session){
        System.out.println("2:tip====---updatebackground");
        return  "user/test";
    }

}
