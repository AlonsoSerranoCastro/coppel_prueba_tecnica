package com.coppel.prueba2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.prueba2.model.Credito;
import com.coppel.prueba2.service.CreditoService;

@RestController
@RequestMapping("credito")
public class CreditoController {

	@Autowired
	CreditoService creditoService;
	
	@GetMapping("/saludar")
	public String saludar() {
		return "hello Jhony";
	}
	
	@GetMapping("/all")
	public List<Credito> getAllCredits(){
		return creditoService.getAllCredits();
	}
	
	@GetMapping("/find/{numCliente}")
	public Optional<Credito> getUserById(@PathVariable("numCliente")Long numCliente){
		return creditoService.getCreditById(numCliente);
	}
	
	@PostMapping("/save")
	public Credito saveClient(@RequestBody Credito c) {
		return creditoService.saveClient(c);
	}
	
	@DeleteMapping("/delete/{numCliente}")
	public String deleteClientById(@PathVariable("numCliente")Long numCliente) {
		if(creditoService.deleteClientById(numCliente))
			return "Se ha eliminado el usuario correctamente";
		else
			return "No se ha eliminado el usuario";
	}
}

