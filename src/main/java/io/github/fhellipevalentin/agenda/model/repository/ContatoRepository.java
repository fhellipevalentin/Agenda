package io.github.fhellipevalentin.agenda.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fhellipevalentin.agenda.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
