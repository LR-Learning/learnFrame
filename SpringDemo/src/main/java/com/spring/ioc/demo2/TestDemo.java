package com.spring.ioc.demo2;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 23:04 2018/7/6
 * @Modified By:
 **/
public class TestDemo {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);
        ((ClassPathXmlApplicationContext) applicationContext).close();;
    }
}
