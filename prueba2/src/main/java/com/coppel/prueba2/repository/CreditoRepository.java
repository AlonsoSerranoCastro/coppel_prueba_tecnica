package com.coppel.prueba2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coppel.prueba2.model.Credito;

public interface CreditoRepository extends MongoRepository<Credito, Long> {

}
