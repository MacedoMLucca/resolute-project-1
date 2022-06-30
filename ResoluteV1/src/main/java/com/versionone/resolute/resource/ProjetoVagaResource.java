package com.versionone.resolute.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.versionone.resolute.entities.ProjetoVaga;
import com.versionone.resolute.repositories.ProjetoVagaRepository;

@RestController
@CrossOrigin
@RequestMapping({"/cadastroProjeto"})
public class ProjetoVagaResource{
	
	
	private ProjetoVagaRepository repository;
	
	
	ProjetoVagaResource(ProjetoVagaRepository projetorepository){
		this.repository = projetorepository;
	}	
	
	
	@GetMapping
	public List findAll(){
	    return repository.findAll();
	}
	  
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity findById(@PathVariable long id){
	    return repository.findById(id)
	          .map(record -> ResponseEntity.ok().body(record))
	          .orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	  public ProjetoVaga create(@RequestBody ProjetoVaga projeto){
	     return repository.save(projeto);
	} 
	  
	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id,
	                                        @RequestBody ProjetoVaga projeto) {
		//return null;
		return repository.findById(id)
		           .map(record -> {
		           record.setTitulo(projeto.getTitulo());
		           record.setRamo(projeto.getRamo());
		           record.setDescricao(projeto.getDescricao());
		           record.setAtividade(projeto.getAtividade());
		           record.setHabilidade(projeto.getHabilidade());
		           record.setPrecoHora(projeto.getPrecoHora());
		           ProjetoVaga updated = repository.save(record);
		           return ResponseEntity.ok().body(updated);
		           }).orElse(ResponseEntity.notFound().build());
	
	}
	  
	 @DeleteMapping(path ={"/{id}"})
	public ResponseEntity <?> delete(@PathVariable long id) {
	   return repository.findById(id)
	          .map(record -> {
	              repository.deleteById(id);
	              return ResponseEntity.ok().build();
	          }).orElse(ResponseEntity.notFound().build());
	}
	  
}
