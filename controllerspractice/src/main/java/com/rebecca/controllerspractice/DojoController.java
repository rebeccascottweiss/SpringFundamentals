package com.rebecca.controllerspractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("/{location}")
	public String displayLocation(@PathVariable("location") String location) {

		if(location.equals("dojo")) {
			return "The Dojo is awesome!"; 
		} else if (location.equals("burbank-dojo")){
			return "Burbank Dojo is located in Southern California"; 
		} else if (location.equals("san-jose")) {
			return "SJ dojo is the headquarters"; 
		} else {
			return "This is not a dojo location"; 
		}
	}
}
