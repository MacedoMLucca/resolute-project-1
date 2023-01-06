package com.versionone.resolute.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "projetoVaga")
public class ProjetoVaga{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length=150)
	private String titulo;
	
	@Column(length=100)
	private String ramo;
	
	@Column(length=255)
	private String descricao;

	@Column(length=255)
	private String atividade;
	
	@Column(length=200)
	private String habilidade;
	
	@Column(length=30)
	private String precoHora;
	
	@Column(length=3)
	private String fisica;
	
	@Column(length=3)
	private String mental;
	
	@Column(length=3)
	private String auditiva;
	
	@Column(length=3)
	private String visual;
	
	@Column(length=50)
	private String categoria;
	
	@Column(length=10)
	private String tempoExperiencia;
	
	@Column(length=30)
	private String formaPagamento;
	
	@Column(length=30)
	private String adaptado;
	
	
}


