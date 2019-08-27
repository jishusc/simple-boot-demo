package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello" + System.currentTimeMillis();
	}
	
	@GetMapping("/hello1")
	public String hello1() {
		return "hello1" + System.currentTimeMillis();
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "hello2" + System.currentTimeMillis();
	}
	
	@GetMapping("/hello3")
	public String hello3() {
		return "hello3" + System.currentTimeMillis();
	}
}
