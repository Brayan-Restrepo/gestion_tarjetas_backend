package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.TarjetaDto;

public interface TarjetaService {
	
	public List<TarjetaDto> findAll();
	public boolean saveCliente(TarjetaDto tarjetaDto);

}
