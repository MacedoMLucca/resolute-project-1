package com.versionone.resolute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.versionone.resolute.entities.ProjetoVaga;
import com.versionone.resolute.repositories.ProjetoVagaRepository;

import java.util.List;

@Service
public class ProjetoServiceImp implements ProjetoService{

	@Autowired
	private ProjetoVagaRepository projetorepository;
	
	
	@Override
	public List<ProjetoVaga> getAllProjeto(){
		return projetorepository.findAll();
	}
	
	
	
	@Override
	public void saveProjeto(ProjetoVaga projeto) {
		this.projetorepository.save(projeto);
	}

}
