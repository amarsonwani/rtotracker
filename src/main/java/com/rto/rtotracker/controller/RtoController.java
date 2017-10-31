package com.rto.rtotracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RtoController {

	@RequestMapping("/")
	public String index() {
		System.out.println(" This is index");
		return "index";
	}
	
	@RequestMapping("/testjsp")
	public String testMethod(){
		System.out.println(" IN TEST JSP ");
		return "test";
	}
}
