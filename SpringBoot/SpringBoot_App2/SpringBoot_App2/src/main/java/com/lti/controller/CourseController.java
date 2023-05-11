package com.lti.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Course;
import com.lti.entity.Student;
import com.lti.service.CourseService;

@Controller
//@ResponseBody
@RestController
//@RestController -> @ResponseBody + @Controller
public class CourseController {
	
	@Autowired
	private CourseService cs;
	
	@RequestMapping("/Courses")
	public List<Course> getallcourse(){
		 return cs.getCourse();
	}
	//http://localhost:8083/Courses
	
	@RequestMapping("/course/{id}")
	public Course findById(@PathVariable int id){
		 return cs.getCourseById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Course deleteById(@PathVariable int id){
		 return cs.deleteById(id);
	}
		 
//	@RequestMapping("/home")
//	public String home() {
//		return "hello user";
//	}
	
//	@RequestMapping("/courses")
//	public List<Course> getallcourse(){
//		 return Arrays.asList(new Course(101, "Maths"),
//				 new Course(102, "Science"));
//	}
	
	@RequestMapping("/students")
	public List<Student> getallstudent(){
		 return Arrays.asList(new Student(7, "Harsh"),
				 new Student(2, "Jay"));
	}
}
