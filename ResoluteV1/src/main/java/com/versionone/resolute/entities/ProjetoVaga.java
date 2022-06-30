package com.versionone.resolute.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//@Entity(name="projeto")
public class ProjetoVaga{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length=150)
	private String titulo;
	
	@Column(length=100)
	private String ramo;
	
	@Column(length=150)
	private String descricao;

	@Column(length=255)
	private String atividade;
	
	@Column(length=200)
	private String habilidade;
	
	@Column(length=30)
	private String precoHora;
	
}

//Atualizar tabela no banco
//  --- Drop table projeto
//  --- Create table projetoVaga
//Adaptar classe para projrto e vaga 





