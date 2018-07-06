package com.spring.example.demo3;

import com.spring.example.demo2.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 10:27 2018/7/6
 * @Modified By:
 **/
public class TestDemo {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}
