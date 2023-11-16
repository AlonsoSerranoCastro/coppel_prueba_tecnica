package com.coppel.prueba.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.prueba.model.Cliente;
import com.coppel.prueba.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ApiDemo {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/saludar")
	public String saludar() {
		return "hello Jhony";
	}
	
	@GetMapping("/all")
	public ArrayList<Cliente> getAllClients(){
		return clienteService.getAllClients();
	}
	
	@GetMapping("/find/{numCliente}")
	public Optional<Cliente> getUserById(@PathVariable("numCliente")Long numCliente){
		return clienteService.getClientById(numCliente);
	}
	
	@PostMapping("/save")
	public Cliente saveClient(@RequestBody Cliente c) {
		return clienteService.saveClient(c);
	}
	
	@DeleteMapping("/delete/{numCliente}")
	public String deleteClientById(@PathVariable("numCliente")Long numCliente) {
		if(clienteService.deleteClientById(numCliente))
			return "Se ha eliminado el usuario correctamente";
		else
			return "No se ha eliminado el usuario";
	}
}
