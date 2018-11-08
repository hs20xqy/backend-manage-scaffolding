package com.waston.dao.mapper;

import com.waston.common.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: hs
 * @Date: 2018/11/7 17:35
 * @Description:
 */
@Mapper
public interface UserMapper {

    /**
     * 根据ID获取用户
     * @param userId
     * @return
     */
    User getUser(@Param("userId") String userId);
}
