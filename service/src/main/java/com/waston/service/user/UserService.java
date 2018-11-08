package com.waston.service.user;

import com.waston.common.entity.User;

/**
 * @Author: hs
 * @Date: 2018/11/8 17:18
 * @Description:
 */
public interface UserService {

    /**
     * 根据用户id获取用户
     * @param userId 用户id
     * @return
     */
    User getUser(String userId);
}
