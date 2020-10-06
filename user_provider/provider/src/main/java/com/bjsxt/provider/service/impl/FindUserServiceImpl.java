package com.bjsxt.provider.service.impl;

import com.bjsxt.api.FindUserService;
import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.pojo.UsersExample;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* 查询所有用户业务层
*/
@Service
public class FindUserServiceImpl implements FindUserService {

    @Autowired
    private UsersMapper usersMapper;
    /**
    * 查询全部用户
    * @return
    */
    @Override
    public List<Users> findUserAll() {
        UsersExample example = new UsersExample();
        return this.usersMapper.selectByExample(example);
    }
}