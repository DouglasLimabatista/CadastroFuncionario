package com.projeto.projeto.mv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.projeto.mv.model.ComidaModel;
import com.projeto.projeto.mv.model.UsuarioModel;
import com.projeto.projeto.mv.repository.ComidaRepository;

@Service
public class ComidaService {

 @Autowired
private ComidaRepository repository;

	public ComidaService(ComidaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public ComidaModel consultar(String nome) {
		return repository.consultarPorNome(nome);	
	}
	public void  inserir(ComidaModel comida) {
		repository.inserir(comida);
}
}