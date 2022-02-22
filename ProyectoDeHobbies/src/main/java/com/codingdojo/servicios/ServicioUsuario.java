package com.codingdojo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Usuario;
import com.codingdojo.repositorios.RepositorioUsuario;

@Service
public class ServicioUsuario {
	private final RepositorioUsuario repositorioUsuario;
	
	public ServicioUsuario( RepositorioUsuario repositorio ) {
		this.repositorioUsuario = repositorio;
	}
	
	public List<Usuario> selectAllFromUsuarios(){
		return repositorioUsuario.findAll();
	}
}