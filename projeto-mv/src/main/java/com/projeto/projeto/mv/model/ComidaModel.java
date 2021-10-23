package com.projeto.projeto.mv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "comida")
@Table(name = "TB_COMIDA")
public class ComidaModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CDCOMIDA", nullable= false)
	private Integer codigo;
	
	@Column(name= "NMCOMIDA", nullable = false, length = 100)
	private String nome;
	
	@OneToOne
	private UsuarioModel usuario;
	
	@ManyToMany(mappedBy = "comidas")
    private Set<UsuarioModel> usuarios = new HashSet<>();
	
	public ComidaModel(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	 UsuarioModel getComidaUser() {
		return usuario;
	}
	public void setComidaUser(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
}
