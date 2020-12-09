package com.rebecca.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
	@RequestMapping("/Gold")
	public String index(HttpSession session, Model model) {
		Object gold = session.getAttribute("gold"); 
		if(gold == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activity_log", new ArrayList<String>());
			session.setAttribute("lose", 0);
		}; 
		
		return "index.jsp"; 
	}
	
	@RequestMapping(value="/process_money/{location}", method=RequestMethod.POST)
	public String process(HttpSession session, 
							@PathVariable String location, 
							@RequestParam int min, 
							@RequestParam int max) {
		Random generator = new Random(); 
		Date date = new Date(); 
		String pattern = "yyyy-MM-dd HH:mm:ss"; 
		SimpleDateFormat f = new SimpleDateFormat(pattern); 
		String timestamp = f.format(date); 
		int newGold = generator.nextInt(max - min) + min; 
		Integer userGold = (Integer) session.getAttribute("gold"); 
		session.setAttribute("gold", userGold + newGold);
		ArrayList<String> activityLog = (ArrayList<String>) session.getAttribute("activity_log");
		String activity = " "; 
		
		if(newGold < 0) {
			activity += "<p><span>Lost " + newGold + " gold from " + location + ". "+ timestamp +"</span></p>";  
		} else {
			activity += "<p>Earned " + newGold + " gold from " + location +". "+ timestamp +"</p>";
		}; 
		activityLog.add(activity); 
		//attempted to reverse the order of the array list. I think there is a good solution to this...
//		ArrayList<String> newLog = Collections.reverse(activityLog);
		session.setAttribute("activity_log", activityLog);		
		
		return "redirect:/Gold"; 
	}

}
