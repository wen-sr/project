package com.wensir.project.controller;

import com.wensir.project.dao.UserMapper;
import com.wensir.project.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/hello")
    public Object hello(){

        User user = userMapper.selectByPrimaryKey(1l);

        return user;
    }
}
