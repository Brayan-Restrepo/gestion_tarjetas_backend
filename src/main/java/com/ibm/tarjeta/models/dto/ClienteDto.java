package com.ibm.tarjeta.models.dto;

import java.io.Serializable;
import java.util.List;

public class ClienteDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String telefono;
	private List<TarjetaDto> tarjetas;
	
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
	public List<TarjetaDto> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(List<TarjetaDto> tarjetas) {
		this.tarjetas = tarjetas;
	}

}
