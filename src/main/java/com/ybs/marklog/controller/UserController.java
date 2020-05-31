package com.ybs.marklog.controller;


import com.ybs.marklog.common.Result;
import com.ybs.marklog.entity.User;
import com.ybs.marklog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-05-31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Result getUser() {
        User user = userService.getById(1L);
        return Result.success(user);
    }

}
