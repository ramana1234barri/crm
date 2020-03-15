package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.crm.service.DemoService;

@Controller
public class DemoController {
	@Autowired
    DemoService service;
	
	@GetMapping("/hello")
	public String hello() {
		return service.sayHello();
	}
	
	@GetMapping("/bye")
	public String bye() {
		return "BYE";
	}
}
