package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/index")
	public String index() {
		Integer valor = 100/0; //variable para forzar un error. Este error sucedera primero, por lo tanto no sucedera algun otro error que continue
		return "index";
	}
}
