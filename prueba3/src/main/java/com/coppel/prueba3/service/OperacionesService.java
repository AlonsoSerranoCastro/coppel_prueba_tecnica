package com.coppel.prueba3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.prueba3.model.Operaciones;
import com.coppel.prueba3.repository.OperacionesRepository;

@Service
public class OperacionesService {
	
	@Autowired
	private OperacionesRepository operacionesRepository;
	
	public List<Operaciones> getAllOperations() {
		return (List<Operaciones>) operacionesRepository.findAll();
	}
	
	public Optional<Operaciones> getOperationtById(long numCliente) {
		return operacionesRepository.findById(numCliente);
	}
	
	public Operaciones saveOperation(Operaciones o){
		return operacionesRepository.save(o);
	}
	
	public boolean deleteOperationById(long numCliente) {
		try {
			Optional<Operaciones> c = getOperationtById(numCliente);
			operacionesRepository.delete(c.get());
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
