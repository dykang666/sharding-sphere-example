package com.example.dbreadwrite.service.impl;

import com.example.dbreadwrite.entity.User;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/22 10:40
 */
public interface UserService {
    /**
     * 获取所有用户信息
     */
    List<User> list();

    /**
     * 单个 保存用户信息
     *
     * @param user
     */
    String saveOne(User user);

}
