package com.projeto.projeto.mv.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.projeto.mv.model.ComidaModel;

@Repository
public interface ComidaRepository extends CrudRepository<ComidaModel, String> {
	
	//Consultar
		@Query(value = "select * from TB_COMIDA WHERE NMCOMIDA= :nome", nativeQuery = true)
		ComidaModel consultarPorNome(@Param("nome") String nome);
		
	//Inserir
		@Modifying
		@Query(value = "INSERT INTO TB_COMIDA (CDCOMIDA,NMCOMIDA) VALUES(:#{#comida.codigo},:#{#comida.nome})", nativeQuery = true)
		void inserir(@Param("comida") ComidaModel comida);
		
	//Atualizar	
		@Query(value = "update * from TB_COMIDA WHERE NMCOMIDA= :nome", nativeQuery = true)
		ComidaModel updatePornome(@Param("nome") String nome);
		
	//Deletar	
		@Query(value = "delete * from TB_COMIDA WHERE NMCOMIDA= :nome", nativeQuery = true)
		ComidaModel deletePorNome(@Param("nome") String nome);
}
