package com.coppel.prueba3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="operaciones")
public class Operaciones {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numCuenta;
	private String fechaOperacion;
	private Float monto;
	private String status;
	
	public Operaciones(String string, double d, String string2) {
		
	}
	public Long getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(Long numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(String fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
