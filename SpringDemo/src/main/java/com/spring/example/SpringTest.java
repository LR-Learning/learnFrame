package com.spring.example;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    String name = "Spring";
    // 传统方式
    @Test
    public void test1(){

        IDao iDao = new DaoImpl();
        String s = iDao.sayHello(name);
        System.out.println(s);
    }

    // Spring 方式调用
    @Test
    public void test2(){
        // 创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IDao iDao = (IDao) applicationContext.getBean("IDao");
        String s = iDao.sayHello("abc");
        System.out.println(s);
    }
}
