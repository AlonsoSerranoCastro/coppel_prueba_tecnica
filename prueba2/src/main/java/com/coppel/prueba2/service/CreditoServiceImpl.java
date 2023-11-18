package com.coppel.prueba2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.prueba2.model.Credito;
import com.coppel.prueba2.repository.CreditoRepository;

@Service
public class CreditoServiceImpl implements CreditoService {
	
	@Autowired 
	private CreditoRepository creditoRepository;
	
	@Override
	public List<Credito> getAllCredits() {
		return (List<Credito>) creditoRepository.findAll();
	}

	@Override
	public Optional<Credito> getCreditById(long numCliente) {
		return creditoRepository.findById(numCliente);
	}

	@Override
	public Credito saveClient(Credito c) {
		return creditoRepository.save(c);
	}

	@Override
	public boolean deleteClientById(long numCliente) {
		try {
			Optional<Credito> c = getCreditById(numCliente);
			creditoRepository.delete(c.get());
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
