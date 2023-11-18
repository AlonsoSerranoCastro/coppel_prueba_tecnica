package com.coppel.prueba2.service;

import java.util.List;
import java.util.Optional;

import com.coppel.prueba2.model.Credito;

public interface CreditoService {
	List<Credito> getAllCredits();
	Optional<Credito> getCreditById(long numCliente);
	Credito saveClient(Credito c);
	boolean deleteClientById(long numCliente);
	
}
