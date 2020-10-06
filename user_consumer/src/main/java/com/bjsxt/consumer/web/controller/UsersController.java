package com.bjsxt.consumer.web.controller;

import com.bjsxt.consumer.service.UserService;
import com.bjsxt.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    /**
     * 处理查询用户请求
     */
    @RequestMapping("/getUser")
    public String getUser(Model model){
        List<Users> list = this.userService.getUsersAll();

        model.addAttribute("list",list);
        return "showUser";
    }

    /**
     * 处理预更新查询请求
     */
    @RequestMapping("/preUpdateUser")
    public String preUpdateUser(Integer userid,Model model){
        Users users = this.userService.preUpdateUsers(userid);
        model.addAttribute("users",users);
        return "updateUsers";
    }

    /**
     * 处理更新用户请求
     */
    @RequestMapping("/updateUser")
    public String updateUser(Users users){
        this.userService.updateUsers(users);
        return "redirect:/ok";
    }

    /**
     * 处理删除用户请求
     */
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer userid){
        this.userService.deleteUsersById(userid);
        return "redirect:/ok";
    }

}