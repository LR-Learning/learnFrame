package com.spring.example.demo2;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 21:03 2018/7/2
 * @Modified By:
 **/
public class Car2 {
    private String name;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
