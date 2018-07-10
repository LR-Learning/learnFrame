package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 21:11 2018/7/10
 * @Modified By:
 **/
public interface UserDao {
    User getUserById(Integer id);

    List<User> getUserByUserName(String username);

    void insertUser(User user);

}
