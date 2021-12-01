package com.backend.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	@GetMapping("/demo")
	public String adminEndPoint() {
		return "Olá Administrador";
	}
	
	@GetMapping("/manager")
	public String managerEndPoint() {
		return "Olá Manager";
	}
	
}
