package com.kkhindigyan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "/")
	public String hello() {
		return "<h2>Hello World!</h2>";
	}
}
