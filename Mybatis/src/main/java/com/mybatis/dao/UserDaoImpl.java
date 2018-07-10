package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 21:12 2018/7/10
 * @Modified By:
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        User user = sqlSession.selectOne("com.mybatis.dao.UserDao.getUserById", id);
        return user;
    }

    @Override
    public List<User> getUserByUserName(String username) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }
}
