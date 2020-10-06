package com.bjsxt.consumer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 页面跳转控制器
*/

@Controller
public class PageController {
    /**
    * 完成页面跳转
    */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}