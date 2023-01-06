package com.versionone.resolute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.versionone.resolute.entities.ProjetoVaga;

@Repository
public interface ProjetoVagaRepository extends JpaRepository<ProjetoVaga, Long> {

}
