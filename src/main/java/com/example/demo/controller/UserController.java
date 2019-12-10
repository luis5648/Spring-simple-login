package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.UserModel;

@Controller
public class UserController {
	
	
	@GetMapping("/login")
	public String inicio(Model model) {
		System.out.println("ruta de inicio\n");
		
		model.addAttribute("usuario", new UserModel());
		
		return "index.html";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute UserModel usuario ){
		//pendiente codigo para manejar la lógica del usuario.- listo xd
		//(usuario y contraseña) y para manejar sus respectivos valores como un objeto
		//y así poder capturarlos mediante un formulario.- listo
		// info: https://spring.io/guides/gs/handling-form-submission/
		
		System.out.println(usuario.getPass());
		System.out.println(usuario.getNombre());
		
		return "main.html";
	}
	
	
	
	
}
