package com.ibm.tarjeta.models.dto;

import java.io.Serializable;
import java.util.Date;

public class ConsumoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date fechaConsumo;
	private String descripcion;
	private String monto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaConsumo() {
		return fechaConsumo;
	}
	public void setFechaConsumo(Date fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}	
}
