package com.example.dbreadwrite.service.impl;

import com.example.dbreadwrite.entity.User;
import com.example.dbreadwrite.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/22 10:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> list() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public String saveOne(User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setStatus(1);
        userMapper.insert(user);
        return "保存成功";
    }
}
