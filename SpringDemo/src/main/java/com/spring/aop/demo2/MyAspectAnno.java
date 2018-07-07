package com.spring.aop.demo2;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author: LR
 * @Descriprition: 切面类
 * @Date: Created in 10:57 2018/7/7
 * @Modified By:
 **/

@Aspect()
public class MyAspectAnno {

    @Before(value = "execution(* com.spring.aop.demo2.OrderDao.save(..))")
    public void before(){
        System.out.println("前置增强方法。。。" );
    }

    @AfterReturning(value = "execution(* com.spring.aop.demo2.OrderDao.delete(..))", returning = "result")
    public void after(Object result){
        System.out.println("后置增强方法。。。" + result);
    }

    @Around(value = "execution(* com.spring.aop.demo2.OrderDao.update(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前-----");
        Object obj = joinPoint.proceed();
        System.out.println("环绕后-----");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.spring.aop.demo2.OrderDao.find(..))", throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("异常抛出通知----" + e.getMessage());
    }
}
