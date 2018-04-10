package com.kevin.lessontwo.testRedis.controller;

import com.kevin.lessontwo.testRedis.entity.UserEntity;
import com.kevin.lessontwo.testRedis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/redis/user")
public class RedisUserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserEntity> list()
    {
        return userService.list();
    }
}