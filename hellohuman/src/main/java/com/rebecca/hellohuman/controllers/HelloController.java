package com.rebecca.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String index(@RequestParam(value="n", required=false) String name, @RequestParam(value="ln", required=false) String lastName) {
		if(name == null && lastName == null) {
			return "Hello Human!<br/> Welcome to Spring Boot!" ; 
		} else if (lastName == null){
			return "Hello " + name + "!<br/> Welcome to Spring Boot!"; 
		} else {
			return "Hello " + name + " " + lastName + "! <br/> Welcome to Spring Boot!"; 
		}
	}
	
	
}
