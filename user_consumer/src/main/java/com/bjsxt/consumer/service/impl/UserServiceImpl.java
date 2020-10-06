package com.bjsxt.consumer.service.impl;

import com.bjsxt.api.AddUserService;
import com.bjsxt.api.DeleteUserService;
import com.bjsxt.api.FindUserService;
import com.bjsxt.api.UpdateUserService;
import com.bjsxt.consumer.service.UserService;
import com.bjsxt.pojo.Users;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 用户操作业务层
*/
@Service
public class UserServiceImpl implements UserService {
    @Reference
    private AddUserService addUserService;

    @Reference
    private FindUserService findUserService;
    @Reference
    private UpdateUserService updateUserService;

    @Reference
    private DeleteUserService deleteUserService;
    @Override
    public void addUser(Users users) {
        this.addUserService.addUser(users);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> getUsersAll() {
        return this.findUserService.findUserAll();
    }
    /**
     * 根据用户 ID 查询用户
     * @param userid
     * @return
     */
    @Override
    public Users preUpdateUsers(Integer userid) {
        return this.updateUserService.preUpdateUsers(userid);
    }

    @Override
    public void updateUsers(Users users) {
        this.updateUserService.updateUsers(users);
    }

    @Override
    public void deleteUsersById(Integer userid) {
        this.deleteUserService.deleteUsersById(userid);
    }
}