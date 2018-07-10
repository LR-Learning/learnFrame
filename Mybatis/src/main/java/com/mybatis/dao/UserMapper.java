package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getUserById(Integer id);

    List<User> getUserByUserName(String username);

    void insertUser(User user);

}