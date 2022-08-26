package com.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Param {
	
	@GetMapping("/hello")
public String newone() {
		return "Hello Boss How are you";
	}

}
