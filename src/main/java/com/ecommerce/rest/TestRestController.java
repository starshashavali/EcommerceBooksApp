package com.ecommerce.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	@GetMapping("/home")
	public String getWelcome() {
		return "Welcome to Govindaaa govindaa...";
	}

}
