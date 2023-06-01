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
		model.addAttribute("error", "Error de Aritmética :(");
		//.getMessage obtiene el mensaje del objeto excepcion
		model.addAttribute("message", ex.getMessage());
		//obtenemos el starus del objeto excepcion para mostrarlo
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		//return "error/aritmetica";
		return "error/generica"; //se puede retornar a esta plantilla en comun
	}
	
	//Personalizamos NumberFormatException
	@ExceptionHandler(NumberFormatException.class)
	//pasamos el objeto error como ex y el Model como model
	public String numberFormatError(NumberFormatException ex, Model model) {
		model.addAttribute("error", "Formato de numero invalido :(");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numero-formato";
		//return "error/generica"; //plantilla en comun que tambien se puede retornar
	}
}
