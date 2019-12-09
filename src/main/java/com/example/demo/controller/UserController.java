package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	
@GetMapping("/")
public String inicio() {
	//m.addAttribute("nombre", name );
	
	return "index.html";
}
	
	
	
	
}
