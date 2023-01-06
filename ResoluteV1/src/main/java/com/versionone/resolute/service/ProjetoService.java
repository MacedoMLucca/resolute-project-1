package com.versionone.resolute.service;

import com.versionone.resolute.entities.ProjetoVaga;

import java.util.List;

public interface ProjetoService {
	List<ProjetoVaga> getAllProjeto();
	void saveProjeto(ProjetoVaga projeto);
	
	
}
