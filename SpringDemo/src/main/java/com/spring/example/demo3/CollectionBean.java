package com.spring.example.demo3;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: LR
 * @Descriprition: 集合类型的注入
 * @Date: Created in 10:21 2018/7/6
 * @Modified By:
 **/
public class CollectionBean {

    private String[] arrs;
    private List<String> list;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arrs=" + Arrays.toString(arrs) +
                ", list=" + list +
                '}';
    }
}
