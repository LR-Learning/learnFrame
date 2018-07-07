package com.spring.aop.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 10:50 2018/7/7
 * @Modified By:
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class TestDemo {

    @Resource(name = "orderDao")
    private OrderDao orderDao;

    @Test
    public void test1(){
        orderDao.save();
        orderDao.find();
        orderDao.update();
        orderDao.delete();
    }
}
