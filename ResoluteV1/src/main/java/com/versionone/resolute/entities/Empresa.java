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
@Table(name="Empresa",  uniqueConstraints = @UniqueConstraint(columnNames = "cnpj"))
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdEmpresa;
	
	@Column(length=150)
	private String nomeEmpresa;
	
	@Column(length=50)
	private String cnpj;
	
	@Column(length=100)
	private String emailEmpresa;
	
	@Column(length=150)
	private String categoriaEmpresa;
	
	@Column(length=50)
	private String telEmpresa;
	
	@Column(length=20)
	private String senhaEmpresa;
	
	
}
