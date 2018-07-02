package com.spring.example.demo1;


import com.spring.example.demo1.DaoImpl;
import com.spring.example.demo1.IDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {
    String name ;
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
        String s = iDao.sayHello(name);
        System.out.println(s);
    }
}
