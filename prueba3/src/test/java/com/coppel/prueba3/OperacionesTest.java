package com.coppel.prueba3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.coppel.prueba3.model.Operaciones;
import com.coppel.prueba3.repository.OperacionesRepository;

@DataJpaTest
public class OperacionesTest {
	
	@Autowired
	private OperacionesRepository operacionesRepository;
	
	@Test
	public void testSaveOperation() {
		Operaciones operaciones = new Operaciones("25 abril 1995",155.25,"Inactivo");
		Operaciones OperationSave = operacionesRepository.save(operaciones);
		
		assertNotNull(OperationSave);
	}
	
}
