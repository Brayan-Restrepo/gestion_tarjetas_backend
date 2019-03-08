package com.ibm.tarjeta.models.dto;

import java.io.Serializable;

public class AsesorDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private String especialidad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
