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
		//pendiente codigo para manejar la lógica del usuario
		//(usuario y contraseña) y para manejar sus respectivos valores como un objeto
		//y así poder capturarlos mediante un formulario
		// info: https://spring.io/guides/gs/handling-form-submission/
		
		return "nothing";
	}
	
	
	
	
}
