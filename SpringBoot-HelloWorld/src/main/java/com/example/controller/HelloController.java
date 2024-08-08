package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {

	@GetMapping("/{message}")
	public String hello(@PathVariable String message) {
		return "Hello welcome to Spring boot" + message;
	}

}
