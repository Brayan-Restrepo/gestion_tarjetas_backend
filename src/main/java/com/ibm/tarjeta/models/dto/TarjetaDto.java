package com.ibm.tarjeta.models.dto;

import java.io.Serializable;

public class TarjetaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numero;
	private String ccv;
	private String tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
