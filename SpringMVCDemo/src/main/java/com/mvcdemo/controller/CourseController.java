package com.mvcdemo.controller;

import com.mvcdemo.model.Course;
import com.mvcdemo.service.CourseService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;


/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 15:16 2018/6/26
 * @Modified By:
 **/
@Controller
@RequestMapping("/courses")
public class CourseController {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(CourseController.class);


    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }


    // 查找课程
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model){
        logger.debug("In viewCourse, courseId={}", courseId);
        Course course = courseService.getCoursebyId(courseId);// 根据课程号查找课程
        model.addAttribute(course);// 对象名称就是course
        return "course_overview";
    }
}


