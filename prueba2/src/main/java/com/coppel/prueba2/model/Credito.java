package com.coppel.prueba2.model;

import org.springframework.data.annotation.Id;

public class Credito {
	
	@Id
	private Long numCliente;
	private String numCuenta;
	private String tipoCredito;
	private String fechaAlta;
	private String status;
	private Float saldo;
	
	public Credito() {
	}
	
	public Credito(Long numCliente, String numCuenta, String tipoCredito, String fechaAlta, String status,
			Float saldo) {
		super();
		this.numCliente = numCliente;
		this.numCuenta = numCuenta;
		this.tipoCredito = tipoCredito;
		this.fechaAlta = fechaAlta;
		this.status = status;
		this.saldo = saldo;
	}
	
	public Long getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(Long numCliente) {
		this.numCliente = numCliente;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getTipoCredito() {
		return tipoCredito;
	}
	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
	
}
