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

import com.projeto.projeto.mv.model.ComidaModel;
import com.projeto.projeto.mv.model.UsuarioModel;
import com.projeto.projeto.mv.service.ComidaService;

@RestController
public class ComidaController {

	@Autowired
	ComidaService service;
	
	@GetMapping(path = "/api/comida/{nome}")
	public ResponseEntity consultar(@PathVariable("nome") String nome) {
		ComidaModel comida = service.consultar(nome);
		return ResponseEntity.ok(comida);
}
	@Transactional
	@PostMapping(path = "/api/comida/criar")
	public ResponseEntity<Void> inserir(@RequestBody ComidaModel comida) {
		ComidaModel comidaCriado;
		service.inserir(comida);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}