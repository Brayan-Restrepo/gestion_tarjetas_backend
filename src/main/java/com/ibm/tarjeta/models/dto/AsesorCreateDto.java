package com.ibm.tarjeta.models.dto;

import java.io.Serializable;

public class AsesorCreateDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String especialidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}
