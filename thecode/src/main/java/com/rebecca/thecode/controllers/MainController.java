package com.rebecca.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class MainController {

	@RequestMapping("/")
	public String enterCode() {
		return "index.jsp"; 
	}; 
	
	@RequestMapping(value="/guess", method = RequestMethod.POST)
	public String processGuess(@RequestParam(value="codeword") String codeword, RedirectAttributes redirects) {
		
		if(codeword.equals("bushido")) {
			return "redirect:/code"; 
		} else { 
			redirects.addFlashAttribute("errors", "You must train harder!"); 
		}
		return "redirect:/"; 
	}; 
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp"; 
	}
}
