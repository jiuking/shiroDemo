package com.hjc.shirodemo.web.controller;

import com.hjc.shirodemo.persistence.dao.entity.User;
import com.hjc.shirodemo.service.UserService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Bravowhale on 2016/12/28.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String showLoginForm(HttpServletRequest request, Model model){
        String exceptionClassName = (String)request.getAttribute("shiroLoginFailure");
        User user = userService.findByUsername("admin");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)){
            error = "用户名/密码错误";
        }else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)){
            error = "用户名/密码错误";
        }else if(exceptionClassName != null){
            error = "其他错误"+exceptionClassName;
        }
        model.addAttribute("error",error);
        return "login";
    }
}
