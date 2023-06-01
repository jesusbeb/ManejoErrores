/*
 * Creamos la clase de Excepcion, en la ventana de New Java Class, Superclass, clic en Browse
 * Buscamos y agregamos RuntimeException
 */

package com.bolsadeideas.springboot.error.app.errors;

public class UsuarioNoEncontradoExcepcion extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//constructor, pasamos el id
	public UsuarioNoEncontradoExcepcion(String id) {
		//Mandamos mensaje, concatenamos el id que recibimos y volvemos a concatenar la continuacion del mensaje
		super("Usuario con ID: ".concat(id).concat(" no existe en el sistema :("));
	}

}
