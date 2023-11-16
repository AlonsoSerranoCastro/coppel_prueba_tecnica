package com.coppel.prueba.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coppel.prueba.model.Cliente;
import com.coppel.prueba.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public ArrayList<Cliente> getAllClients() {
		return (ArrayList<Cliente>) clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> getClientById(long numCliente) {
		return clienteRepository.findById(numCliente);
	}

	@Override
	public Cliente saveClient(Cliente c) {
		return clienteRepository.save(c);
	}

	@Override
	public boolean deleteClientById(long numCliente) {
		try {
			Optional<Cliente> c = getClientById(numCliente);
			clienteRepository.delete(c.get());
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
