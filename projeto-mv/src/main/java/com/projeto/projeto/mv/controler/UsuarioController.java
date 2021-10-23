package com.projeto.projeto.mv.controler;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.projeto.mv.model.UsuarioModel;
import com.projeto.projeto.mv.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@GetMapping(path = "/api/usuario/{cpf}")
	public ResponseEntity consultar(@PathVariable("cpf") String cpf) {
		UsuarioModel usuario = service.consultar(cpf);
		return ResponseEntity.ok(usuario);
	}

	@Transactional
	@PostMapping(path = "/api/usuario/criar")
	public ResponseEntity<Void> inserir(@RequestBody UsuarioModel usuario) {
		UsuarioModel usuarioCriado;
		service.inserir(usuario);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
