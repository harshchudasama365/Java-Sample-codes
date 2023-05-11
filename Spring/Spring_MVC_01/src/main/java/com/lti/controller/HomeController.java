package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	//new.jsp is a View
	@RequestMapping("/")
	public String index() {
		return "new";
	}
	//Open http://localhost:8089/Spring_MVC_01/home/
	
	//method is a View
	@ResponseBody
	@RequestMapping("/msg")
	public String showMsg(){
		return "Welcome to Spring MVC - From show MSg method";
	}
	//Open http://localhost:8089/Spring_MVC_01/home/msg
	
	
	//add the parameter in url and display on view
	@ResponseBody
	@RequestMapping("/helloUser/{id}")
	public String helloUser(@PathVariable("id") int id) {
		return "Welcome User : Your user id : "+id;
	}
	//OPen http://localhost:8089/Spring_MVC_01/home/helloUser/7

	@RequestMapping("/LoginForm")
	public ModelAndView getForm() {
		
		ModelAndView mv = new ModelAndView("LoginForm");
		return mv;
	}
	//OPen http://localhost:8089/Spring_MVC_01/home/LoginForm
	
	@RequestMapping("/SuccessForm")
	public ModelAndView showForm(@RequestParam("username") String username, @RequestParam("pass")String p) {
		
		ModelAndView mv = new ModelAndView("SuccessForm");
		String str = username+" "+p;
		mv.addObject("data", str);
		return mv;
	}
	
}


