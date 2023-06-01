package com.bolsadeideas.springboot.error.app.services;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

/*
 * Clase que hereda de UsuarioService e implementa sus metodos abstractos
 */

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	//constructor para inicializar la lista
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Jesus", "Beltran"));
		this.lista.add(new Usuario(2, "Pepa", "Garcia"));
		this.lista.add(new Usuario(3, "Lalo", "Mena"));
		this.lista.add(new Usuario(4, "Luci", "Fernandez"));
		this.lista.add(new Usuario(5, "Pato", "Gonzalez"));
		this.lista.add(new Usuario(6, "Paco", "Rodriguez"));
		this.lista.add(new Usuario(7, "Juan", "Gomez"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		//inicializamods resultado
		Usuario resultado = null;
		
		//con for iteramos la lista para buscar por id
		//for(tipo de objeto o variable, u variable donde se guardara : this.lista la lista a iterar)
		for(Usuario u : this.lista) {
			//si u.getId es igual al id recibido por parametro
			if(u.getId().equals(id)) { // no se pregunta con == porque en algunos contextos funciona y en otros no, por ejemplo si se trabaja con primitivos
				resultado = u; //resultado se le asigna el objeto u
				break;
			}
		}
		return resultado;
	}

}
