package com.bjsxt.consumer.service.impl;

import com.bjsxt.api.AddUserService;
import com.bjsxt.consumer.service.UserService;
import com.bjsxt.pojo.Users;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
* 用户操作业务层
*/
@Service
public class UserServiceImpl implements UserService {
    @Reference
    private AddUserService addUserService;
    @Override
    public void addUser(Users users) {
        this.addUserService.addUser(users);
    }
}