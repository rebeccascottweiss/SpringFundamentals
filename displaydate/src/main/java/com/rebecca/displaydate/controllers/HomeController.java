package com.rebecca.displaydate.controllers;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private Date today = new java.util.Date(); 
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		String dateString = DateFormat.getDateInstance(DateFormat.FULL).format(today); 
		model.addAttribute("date", dateString); 
		return "date.jsp"; 
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		String timeString = DateFormat.getTimeInstance(DateFormat.FULL).format(today); 
		model.addAttribute("time", timeString); 
		return "time.jsp"; 
	}
}
