package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.entity.Course;

@Service
public class CourseService {
	
	List<Course> clist;
	
	public CourseService() {
		clist = new ArrayList<>();
		clist.add(new Course(89, "Java"));
		clist.add(new Course(76, "Python"));
		clist.add(new Course(121, "C"));
		clist.add(new Course(96, "JavaScript"));
	}
	
	public List<Course> getCourse(){
		return clist;
	}

	public Course getCourseById(int id) {
		Course c_want = null;
		for(Course c: clist) {
			if(c.getCid() == id) {
				c_want = c;
				return c_want;
				
			}
		}
		return null;
	}
	
	public Course deleteById(int id) {
		Course c_deleted = null;
		for(Course c: clist) {
			if(c.getCid() == id) {
				c_deleted = c;
				clist.remove(c);
				return c_deleted;
			}
		}
		return null;
	}
}
