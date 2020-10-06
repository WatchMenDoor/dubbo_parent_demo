package com.bjsxt.consumer.service;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface UserService {
    void addUser(Users users);

    List<Users> getUsersAll();

    Users preUpdateUsers(Integer userid);

    void updateUsers(Users users);

    void deleteUsersById(Integer userid);
}