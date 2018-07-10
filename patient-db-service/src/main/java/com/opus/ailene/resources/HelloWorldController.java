package com.opus.ailene.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldController {
	
	@GetMapping("/welcome")
	public String showWelcome() {
		return "Welcome to Hello World";
	}
	

}
