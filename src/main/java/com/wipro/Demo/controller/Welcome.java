package com.wipro.Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {
	
	@GetMapping("/get/{name}")
	public String getWelcomeMsg(@PathVariable String name) {
		return name+" , welcome to Docker class...";	
	}

}
