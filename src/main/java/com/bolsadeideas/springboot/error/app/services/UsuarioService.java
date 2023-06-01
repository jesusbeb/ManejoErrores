package com.bolsadeideas.springboot.error.app.services;

import java.util.List;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

//creamos una interface personalizada con dos metodos abstractos que se implementaran cuando otra clase herede
public interface UsuarioService {
	
	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);

}
