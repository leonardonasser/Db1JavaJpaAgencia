package com.db1start.cidadesapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgencia;
	
	@Column(name = "numero", length = 60)
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "cidade")
	private Cidade cidade;
	
	@OneToMany(mappedBy = "agencia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Conta> conta;
	
	@Column(name = "NumeroBanco", length = 60)
	private String numeroBanco;
	
	public Agencia() {
		
	}
	
	public Agencia(String numero,String numeroBanco,Cidade cidade){
		this.conta = new ArrayList<>();
       this.numero = numero;
       this.numeroBanco= numeroBanco;
       this.cidade=cidade;
	}	
	
	public Long getidAgencia() {
		return idAgencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	
	
	
	
	
	
}
