package com.mybatis.test;
import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;


/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 12:34 2018/7/8
 * @Modified By:
 **/

public class Test1 {

    @Test
    public void getUserById() throws IOException {

        // 创建SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 创建核心文件的输入流
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 通过输入流创建sqlsessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行查询
        User user = sqlSession.selectOne("getUserById", 1);
        System.out.println(user);

        // 释放资源
        sqlSession.close();
    }
}
