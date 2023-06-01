package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;
import com.bolsadeideas.springboot.error.app.services.UsuarioService;

@Controller
public class AppController {
	
	//inyectamos el UsuarioService 
	@Autowired
	private UsuarioService usuarioService;
	
	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
		//Integer valor = 100/0; //variable para forzar un error. Este error sucedera primero, por lo tanto no sucedera algun otro error que continue
		Integer valor = Integer.parseInt("10fdgfg"); //Forzamos un error NumberFormatException y personalizamos lo que muestre
		return "index";
	}
	
	//Metodo handler ver, se pasa el id por url
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		//Obtenemos el usuario que se busca por Id con el metodo obtenerPorId
		Usuario usuario = usuarioService.obtenerPorId(id);
		//pasamos a la vista el usuario obtenido
		model.addAttribute("usuario", usuario);
		//pasamomos a la vista mensajes y el nombre del usuario
		model.addAttribute("titulo", "Detalle usuario: ".concat(usuario.getNombre()));
		return "ver";
	}
}
