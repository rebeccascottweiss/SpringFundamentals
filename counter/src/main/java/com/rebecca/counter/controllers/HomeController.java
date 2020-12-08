package com.rebecca.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String server(HttpSession session) {
		//sets the session attribute to an object, if it doesn't exist will set to null
		Object sessionCount = session.getAttribute("count"); 
		if(sessionCount == null) {
			//if the attribute doesn't exist, set it to zero
			session.setAttribute("count", 0);
		}
		//once you've set the session attribute, you can increment it.
		Integer count = (Integer) session.getAttribute("count"); 
		count ++; 
		session.setAttribute("count", count); 
			
		return "index.jsp"; 
	}; 
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		model.addAttribute("count", session.getAttribute("count")); 
		return "counter.jsp"; 

	}
}
