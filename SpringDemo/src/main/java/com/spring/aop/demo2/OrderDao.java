package com.spring.aop.demo2;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 10:42 2018/7/7
 * @Modified By:
 **/

public class OrderDao {
    public void save() {
        System.out.println("保存商品。。。。");
    }

    public void find() {
//        int i = 1 / 0;
        System.out.println("查找商品。。。。");
    }

    public void update() {
        System.out.println("更新商品。。。。");
    }

    public String delete() {
        System.out.println("删除商品。。。。");
        return "删除";
    }
}
