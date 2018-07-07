package com.spring.aop.demo1;

import org.aopalliance.intercept.Joinpoint;

/**
 * @Author: LR
 * @Descriprition: 切面类
 * @Date: Created in 10:57 2018/7/7
 * @Modified By:
 **/
public class MyAspectXML {

    public void checkPri(){
        System.out.println("权限校验的方法。。。" );
    }
}
