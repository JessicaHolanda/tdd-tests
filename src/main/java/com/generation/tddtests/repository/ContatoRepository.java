package com.generation.tddtests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.tddtests.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
