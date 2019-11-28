package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idCliente;
 
	@Column(name = "nome", length = 50)
 private String	nome;
 
	@Column(name = "cpf", length = 60)
 private String cpf;
 
	@Column(name = "telefone", length = 15)
 private String	telefone;

	public Cliente() {	
}
	public Cliente(String nome, String cpf,String telefone ) {
       this.nome=nome;
       this.cpf=cpf;
       this.telefone=telefone;
	}
	
	
}
