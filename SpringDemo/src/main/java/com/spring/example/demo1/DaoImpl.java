package com.spring.example.demo1;

import java.util.Calendar;

public class DaoImpl implements IDao {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello(String name){
            int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY); // 获取小时数

            if(hour < 6) return "凌晨好"+name;
            if(hour < 12) return "早上好"+name;
            if(hour < 13) return "中午好"+name;
            if(hour < 186) return "下午好"+name;
            return "晚上好"+name;
        }

}
