package com.lucky.controller;

import com.lucky.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/logined")
    public String logined(@RequestParam("account")String account,
                          @RequestParam("password")String password,
                                HttpSession session){
        if(account.equals("lth") && password.equals("1111")) {
            User user = new User();
            user.setAccount(account);
            user.setPassword(password);
            session.setAttribute("user",user);
            return "redirect:user/search";
            //如果用户直接知道这个访问地址http://localhost:8080/user/search，
            // 那么一些用户行为我们无法监听到
        }else{

            return "login";
        }
    }
}
