package com.coppel.prueba3.controller;

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

import com.coppel.prueba3.model.Operaciones;
import com.coppel.prueba3.service.OperacionesService;

@RestController
@RequestMapping("operaciones")
public class OperacionesController {
	
	@Autowired
	private OperacionesService operacionesService;
	
	@PostMapping("save")
	public Operaciones createOperation(@RequestBody Operaciones operaciones) {
		return operacionesService.saveOperation(operaciones);
	}
	
	@GetMapping("all")
	public List<Operaciones> getAllOperations(){
		return operacionesService.getAllOperations();
	}
	
	@GetMapping("/find/{numCuenta}")
	public Optional<Operaciones> getOperationById(@PathVariable("numCuenta") Long numCuenta){
		return operacionesService.getOperationtById(numCuenta);
	}
	
	@DeleteMapping("/delete/{numCuenta}")
	public boolean deleteOperationById(@PathVariable("numCuenta") Long numCuenta){
		return operacionesService.deleteOperationById(numCuenta);
	}

}
