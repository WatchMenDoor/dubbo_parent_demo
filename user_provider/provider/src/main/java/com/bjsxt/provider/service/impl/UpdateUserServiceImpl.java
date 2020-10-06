package com.bjsxt.provider.service.impl;

import com.bjsxt.api.UpdateUserService;
import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
* 更新用户业务
*/
@Service
public class UpdateUserServiceImpl implements UpdateUserService {
    @Autowired
    private UsersMapper usersMapper;
    /**
    * 预更新用户查询
    * @param userid
    * @return
    */
    @Override
    public Users preUpdateUsers(Integer userid) {
        return this.usersMapper.selectByPrimaryKey(userid);
    }
    /**
    * 更新用户

    * @param users
    */
    @Override
    public void updateUsers(Users users) {
        this.usersMapper.updateByPrimaryKey(users);
    }
}