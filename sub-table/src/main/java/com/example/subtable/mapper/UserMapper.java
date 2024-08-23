package com.example.subtable.mapper;

import com.example.subtable.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/22 16:13
 */
@Mapper
public interface UserMapper {
    /**
     * 批量插入
     *
     * @param list 插入集合
     * @return 插入数量
     */
    int insertForeach(List<User> list);

    /**
     * 获取所有用户
     */
    List<User> selectAll();

    /**
     * 插入一条记录
     *
     * @param record 实体对象
     * @return 更新条目数
     */
    int insert(User record);

}
