package com.rebecca.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	
	@RequestMapping(value="/process", method = RequestMethod.POST)
	public String process(@RequestParam String name, @RequestParam String location, @RequestParam String language, @RequestParam String comment, HttpSession session) {
		session.setAttribute("name", name); 
		session.setAttribute("location", location);
		session.setAttribute("language", language); 
		if(comment != null) {
			session.setAttribute("comment", comment); 
		}; 
		
		return "redirect:/result"; 
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		
		if(session.getAttribute("language").equals("Java")) {
			return "redirect:/javaLove"; 
		}
		model.addAttribute("name", session.getAttribute("name")); 
		model.addAttribute("location", session.getAttribute("location")); 
		model.addAttribute("language", session.getAttribute("language")); 
		Object optionalComment = session.getAttribute("comment"); 
		if (optionalComment != null) {
			model.addAttribute("comment", optionalComment.toString()); 
		}

		return "result.jsp"; 
	}
	
	@RequestMapping("/javaLove")
	public String javaLove(HttpSession session, Model model) {
		model.addAttribute("name", session.getAttribute("name")); 
		return "javaLove.jsp"; 
	}

}
