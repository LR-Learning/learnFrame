package com.mvcdemo.pojo;

import java.util.Date;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 10:20 2018/7/14
 * @Modified By:
 **/
public class Item {
    private int id;
    private String name;
    private double price;
    private Date createTime;
    private String detail;


    public Item(){

    }
    public Item(int id, String name, double price, Date createTime, String detail){
        this.id = id;
        this.name = name;
        this.price = price;
        this.createTime = createTime;
        this.detail = detail;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
