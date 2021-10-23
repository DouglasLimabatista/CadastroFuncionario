package com.projeto.projeto.mv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.projeto.mv.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

	//Consultar
		@Query(value = "select * from TB_USUARIO WHERE NUCPF= :cpf", nativeQuery = true)
		UsuarioModel consultarPorCpf(@Param("cpf") String cpf);
	
	//Inserir
		@Modifying
		@Query(value = "INSERT INTO TB_USUARIO (NUCPF,NMUSUARIO) VALUES(:#{#usuario.cpf},:#{#usuario.nome})", nativeQuery = true)
		void inserir(@Param("usuario") UsuarioModel usuario);
			
	//Atualizar
		@Query(value = "update * from TB_USUARIO WHERE NUCPF= :cpf", nativeQuery = true)
		UsuarioModel updatePorCpf(@Param("cpf") String cpf);
	
	//Deletar
		@Query(value = "delete * from TB_USUARIO WHERE NUCPF= :cpf", nativeQuery = true)
		UsuarioModel deletePorCpf(@Param("cpf") String cpf);
	
	




}
