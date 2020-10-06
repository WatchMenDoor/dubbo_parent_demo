package com.bjsxt.provider.service.impl;

import com.bjsxt.api.AddUserService;
import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: liuxw
 * @Date: 2020-10-06
 * @Description: com.bjsxt.provider.service.impl
 * @version: 1.0
 */
@Service
public class AddUserServiceImpl implements AddUserService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insert(users);

    }
}
