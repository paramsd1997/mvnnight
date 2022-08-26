package com.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Param {
	
	@GetMapping("/hello")
public String newone() {
		return "Hello boss";
	}
	@GetMapping("/hello1")
public String newone() {
		return "How Are You";
	}
	@GetMapping("/hello2")
public String newone() {
		return " I Am Good ";
	}
}
