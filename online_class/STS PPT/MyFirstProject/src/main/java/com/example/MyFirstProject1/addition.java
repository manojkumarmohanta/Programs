package com.example.MyFirstProject1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addition {
	private int a = 10;
	private int b = 20;
	private int c = a+b;
	@RequestMapping("/display")
	public String Display() {
		return "test runner";
	}
	@RequestMapping("/add")
	public int add() {
		return c;
	}
	
}
