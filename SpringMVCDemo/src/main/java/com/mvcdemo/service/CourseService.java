package com.mvcdemo.service;

import com.mvcdemo.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
