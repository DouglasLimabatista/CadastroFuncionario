package com.projeto.projeto.mv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.projeto.mv.model.UsuarioModel;
import com.projeto.projeto.mv.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		super();
		this.repository = repository;

	}

	public UsuarioModel consultar(String cpf) {
		return repository.consultarPorCpf(cpf);

	}
	public void  inserir(UsuarioModel usuario) {
		repository.inserir(usuario);
	}
}