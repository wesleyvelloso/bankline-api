package com.dio.santander.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.api.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}