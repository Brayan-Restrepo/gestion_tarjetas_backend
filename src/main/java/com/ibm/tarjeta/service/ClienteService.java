package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.ClienteDto;
import com.ibm.tarjeta.models.dto.ClienteUpDto;

public interface ClienteService {

	public List<ClienteDto> findAll();
	public boolean saveCliente(ClienteDto clienteDto);
	public boolean updateCliente(ClienteUpDto clienteUpDto);
	public void deleteCliente(Long id);
}
