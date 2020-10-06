package com.bjsxt.consumer.web.controller;

import com.bjsxt.consumer.service.UserService;
import com.bjsxt.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 处理用户操作控制器
*/
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserService userService;

    /**
    * 处理添加用户请求
    */
    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.userService.addUser(users);
        return "redirect:/ok";
    }

}