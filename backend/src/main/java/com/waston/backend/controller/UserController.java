package com.waston.backend.controller;

import com.waston.common.entity.User;
import com.waston.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hs
 * @Date: 2018/11/8 17:03
 * @Description:
 */
@RestController("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public String getUser(@RequestParam(value = "userId") String userId) {
        User user = userService.getUser(userId);
        return user.toString();
    }

}
