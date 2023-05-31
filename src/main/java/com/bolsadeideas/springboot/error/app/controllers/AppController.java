package com.bolsadeideas.springboot.error.app.controllers;

@Controller
public class AppController {

	@GetMapping("/index")
	public String index() {
		
		return index;
	}
}
