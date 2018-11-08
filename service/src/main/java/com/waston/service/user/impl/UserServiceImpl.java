package com.waston.service.user.impl;

import com.waston.common.entity.User;
import com.waston.dao.mapper.UserMapper;
import com.waston.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hs
 * @Date: 2018/11/8 17:19
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userId) {
        return userMapper.getUser(userId);
    }
}
