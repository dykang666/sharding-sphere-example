package com.example.dbreadwrite.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:   user表
 * @date 2024/8/22 10:43
 */
@Data
public class User {
    /**
     * 主键
     */
    private Long id;

    public User(Long id, String name, String sex, Integer age, Date createTime, Date updateTime, Integer status) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 是否删除 1删除 0未删除
     */
    private Integer status;

    public User(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
