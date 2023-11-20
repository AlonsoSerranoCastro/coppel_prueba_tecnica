package com.coppel.prueba3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coppel.prueba3.model.Operaciones;

@Repository
public interface OperacionesRepository extends JpaRepository<Operaciones, Long> {
	

}
