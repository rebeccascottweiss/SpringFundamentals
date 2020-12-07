package com.rebecca.controllerspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping ("/")
	public String hello() {
		return "hello world"; 
	}
	
	@RequestMapping ("/world")
	public String world() {
		return "Class level annotations are cool, too!"; 
	}
}
