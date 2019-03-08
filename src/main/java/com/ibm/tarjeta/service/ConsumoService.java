package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.ConsumoDto;

public interface ConsumoService {
	
	public List<ConsumoDto> findAll();
	public boolean saveCliente(ConsumoDto consumoDto);
	
}
