package com.spring.example.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 20:50 2018/7/2
 * @Modified By:
 **/
public class Test1 {

    // 构造方法注入
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Car car = (Car) applicationContext.getBean("Car");
        System.out.println(car);
    }

    // set方法注入
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("Car2");
        System.out.println(car2);
    }

    // set方法属性设置
    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
