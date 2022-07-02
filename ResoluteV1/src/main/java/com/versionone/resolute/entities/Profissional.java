package com.versionone.resolute.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="Profissional",  uniqueConstraints = @UniqueConstraint(columnNames = "cpf"))
public class Profissional {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdProfissional;
	
	@Column(length=100)
	private String nomeProf;
	
	@Column(length=100)
	private String nomeSocial;
	
	@Column(length=100)
	private String emailProf;

	@Column(length=30)
	private String cpf;
	
	@Column(length=30)
	private String telefoneProf;
	
	@Column(length=30)
	private String genero;
	
	@Column(length=30)
	private String categoria;
	
	@Column(length=150)
	private String hardskill;
	
	@Column(length=150)
	private String profissaPCD;
	
	@Column(length=150)
	private String freelancer;
	
	@Column(length=10)
	private String tempoExperiencia;
	
	@Column(length=30)
	private String formaPagamento;
	
	@Column(length=3)
	private String presencial;
	
	@Column(length=3)
	private String homeOffice;
	
	@Column(length=3)
	private String hibrido;

	@Column(length=3)
	private String flexivel;
	
	@Column(length=3)
	private String fisica;
	
	@Column(length=3)
	private String mental;
	
	@Column(length=3)
	private String auditiva;
	
	@Column(length=3)
	private String visual;
	
	@Column(length=30)
	private String senhaProf;
}



























