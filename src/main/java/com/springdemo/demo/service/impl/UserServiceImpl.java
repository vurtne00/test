package com.springdemo.demo.service.impl;

import com.springdemo.demo.mapper.UserMapper;
import com.springdemo.demo.modle.User;
import com.springdemo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfoByUid(Integer Uid) {
        return userMapper.getUserByUid(Uid);
    }
}
