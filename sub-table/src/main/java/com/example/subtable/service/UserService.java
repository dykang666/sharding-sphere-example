package com.example.subtable.service;

import com.example.subtable.entity.User;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/22 16:14
 */
public interface UserService {
    /**
     * 获取所有用户信息
     */
    List<User> list();

    /**
     *   批量 保存用户信息
     * @param userVOList
     */
    String  insertForeach(List<User> userVOList);
}
