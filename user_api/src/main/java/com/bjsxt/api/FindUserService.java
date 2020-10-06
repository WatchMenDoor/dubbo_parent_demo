package com.bjsxt.api;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface FindUserService {
    List<Users> findUserAll();
}