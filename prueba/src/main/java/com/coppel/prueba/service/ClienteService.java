package com.coppel.prueba.service;

import java.util.ArrayList;
import java.util.Optional;

import com.coppel.prueba.model.Cliente;


public interface ClienteService {
	ArrayList<Cliente> getAllClients();
	Optional<Cliente> getClientById(long numCliente);
	Cliente saveClient(Cliente c);
	boolean deleteClientById(long numCliente);
	
}
