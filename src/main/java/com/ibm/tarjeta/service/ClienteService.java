package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.ClienteDto;

public interface ClienteService {

	public List<ClienteDto> findAll();
	public boolean saveCliente(ClienteDto clienteDto);
	public boolean updateCliente(ClienteDto clienteDto);
	public boolean deleteCliente(Long id);
}
