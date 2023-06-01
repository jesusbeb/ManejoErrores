/*
 * Esta clase personalizara la excepcion ArithmeticException
 */

package com.bolsadeideas.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//Esta anotacion maneja errores
@ControllerAdvice
public class ErrorHandlerController {

	//Mapeamos con ExceptionHandler y el nombre de la excepcion
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(ArithmeticException ex, Model model) {
		//Pasamos datos a la vista
		model.addAttribute("error", "Error de Aritmética");
		//.getMessage obtiene el mensaje del objeto excepcion
		model.addAttribute("message", ex.getMessage());
		//obtenemos el starus del objeto excepcion para mostrarlo
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/aritmetica";
	}
}
