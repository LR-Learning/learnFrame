package com.mvcdemo.controller;

import com.mvcdemo.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: LR
 * @Descriprition: SpringMvc 入门
 * @Date: Created in 10:15 2018/7/14
 * @Modified By:
 **/
@Controller
public class ItemController {

    @RequestMapping("itemList")
    public ModelAndView itemList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Item> list =  Arrays.asList(new Item(1, "冰箱", 1599.9, new Date(), "冰箱"),
                new Item(2, "电脑", 4999.9, new Date(), "联想"));
        modelAndView.addObject("itemList", list);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }
}
