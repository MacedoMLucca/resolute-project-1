package com.versionone.resolute.resource;

import java.util.List;

import javax.persistence.Column;

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
@RequestMapping({"/cadastroProjetoVaga"})
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
	  public ProjetoVaga create(@RequestBody ProjetoVaga projetovaga){
	     return repository.save(projetovaga);
	} 
	  
	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id,
	                                        @RequestBody ProjetoVaga projetovaga) {
		return repository.findById(id)
		           .map(record -> {
		           record.setTitulo(projetovaga.getTitulo());
		           record.setRamo(projetovaga.getRamo());
		           record.setDescricao(projetovaga.getDescricao());
		           record.setAtividade(projetovaga.getAtividade());
		           record.setHabilidade(projetovaga.getHabilidade());
		           record.setPrecoHora(projetovaga.getPrecoHora());
		           record.setFisica(projetovaga.getFisica());
		           record.setMental(projetovaga.getMental());
		           record.setAuditiva(projetovaga.getAuditiva());
		           record.setVisual(projetovaga.getVisual());
		           record.setCategoria(projetovaga.getCategoria());
		           record.setTempoExperiencia(projetovaga.getTempoExperiencia());
		           record.setFormaPagamento(projetovaga.getFormaPagamento());
		           record.setAdaptado(projetovaga.getAdaptado());		           
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
