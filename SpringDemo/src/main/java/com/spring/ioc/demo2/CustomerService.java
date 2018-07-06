package com.spring.ioc.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: LR
 * @Descriprition: Bean 的生命周期
 * @Date: Created in 23:00 2018/7/6
 * @Modified By:
 **/
@Service("customerService")
@Scope
public class CustomerService {

    @PostConstruct  // 相当于init-method
    public void init(){
        System.out.println(" CustomerService被初始化了。。。。。");
    }

    public void save(){
        System.out.println(" CustomerService被执行了。。。。。");
    }
    @PreDestroy  // 相当于destory-method
    public void destory(){
        System.out.println(" CustomerService被销毁了。。。。。");
    }
}
