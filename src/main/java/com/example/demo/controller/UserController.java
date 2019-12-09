package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String inicio() {
		System.out.println("ruta de inicio\n");
	
		return "index.html";
	}
	
	@PostMapping("/login")
	public String login(){
		
		
		return "nothing";
	}
	
	
	
	
}
