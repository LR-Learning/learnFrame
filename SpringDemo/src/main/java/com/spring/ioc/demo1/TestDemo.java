package com.spring.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: LR
 * @Descriprition: Spring的IOC注解开发测试类
 * @Date: Created in 10:54 2018/7/6
 * @Modified By:
 **/
public class TestDemo {

    //传统方法
    @Test
    public void test1(){
        UserDao userDao = new UserDaoImpl();
        userDao.save();
    }

    //spring的IOC注解方式
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }

}
