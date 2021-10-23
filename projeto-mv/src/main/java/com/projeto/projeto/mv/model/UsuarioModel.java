package com.projeto.projeto.mv.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity(name = "usuario")
@Table(name = "TB_USUARIO")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CDUSUARIO", nullable= false)
	private Integer codigo;
	
	@Column(name= "NMUSUARIO",nullable = false, length = 40)
	private String nome;
	
	@Column(name= "NUCPF",nullable = false, length = 14, unique=true)
	private String cpf;
	
	
	public UsuarioModel(Integer codigo, String nome, String cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}
	@ManyToMany   
	@JoinTable(name = "comida_usuario",joinColumns = {@JoinColumn(name = "CDUSUARIO")}, inverseJoinColumns = {@JoinColumn(name = "CDCOMIDA")} )
	private Set<ComidaModel> comidas = new HashSet<>();
	
	public UsuarioModel() {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/*public ComidaModel getUserComida() {
		return comida;
	}
	public void setUserComida(ComidaModel comida) {
		this.comida = comida;
	}*/ 
	
}
  	