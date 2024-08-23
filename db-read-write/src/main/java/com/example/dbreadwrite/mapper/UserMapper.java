package com.example.dbreadwrite.mapper;

import com.example.dbreadwrite.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/22 10:45
 */
//@Repository
@Mapper
public interface UserMapper {
    /**
     * 插入一条记录
     *
     * @param record 实体对象
     * @return 更新条目数
     */
    int insert(User record);

    /**
     * 获取所有用户
     */
    List<User> selectAll();
}
