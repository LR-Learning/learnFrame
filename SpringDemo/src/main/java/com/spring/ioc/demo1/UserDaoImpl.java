package com.spring.ioc.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 10:53 2018/7/6
 * @Modified By:
 **/
@Component("userDao")
public class UserDaoImpl implements UserDao {

    @Value("meiko")
    private String name;

    public void save() {
        System.out.println("DAO层保存方法执行了...." + name);
    }
}
