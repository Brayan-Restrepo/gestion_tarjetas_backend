package com.ibm.tarjeta.models.dto;

import java.io.Serializable;

public class ClienteDto implements Serializable {
	
	private String nombre;
	private String direccion;
	private String ciudad;
	private String telefono;
	
	private static final long serialVersionUID = 1L;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
