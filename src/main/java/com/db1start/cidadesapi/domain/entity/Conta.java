package com.db1start.cidadesapi.domain.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idconta;
	
	@Column
	private Double saldo;
	
	@ManyToOne
	@JoinColumn(name = "Agencia_id")
	private Agencia agencia;
	
	@ManyToOne
	@JoinColumn(name = "Cliente_id")
	private Cliente cliente;
	
	public Conta() {}
public Conta(Double saldo,Agencia agencia,Cliente cliente){
	this.saldo=saldo;
	this.agencia=agencia;
	this.cliente=cliente;
}	
	
	
}
