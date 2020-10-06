package com.bjsxt.provider.service.impl;

import com.bjsxt.api.DeleteUserService;
import com.bjsxt.mapper.UsersMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: liuxw
 * @Date: 2020-10-06
 * @Description: com.bjsxt.provider.service.impl
 * @version: 1.0
 */
@Service
public class DeleteUsersById implements DeleteUserService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void deleteUsersById(Integer userid) {
        this.usersMapper.deleteByPrimaryKey(userid);
    }
}
