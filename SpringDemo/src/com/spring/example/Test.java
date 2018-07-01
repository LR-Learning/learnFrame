package com.spring.example;


public class Test {

    // 传统方式
    @Test
    public void Test1(){
        String name = "Spring";
        // 实例化ServiceExample
        com.spring.example.ServiceExample service = new com.spring.example.ServiceExample();
        service.service(name); // 调用service方法

    }
}
