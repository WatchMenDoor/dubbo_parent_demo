package com.bjsxt.api;

import com.bjsxt.pojo.Users;

public interface UpdateUserService {
    Users preUpdateUsers(Integer userid);

    void updateUsers(Users users);
}