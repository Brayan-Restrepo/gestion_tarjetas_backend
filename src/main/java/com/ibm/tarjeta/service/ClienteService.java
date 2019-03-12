package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.ClienteCreateDto;
import com.ibm.tarjeta.models.dto.ClienteDto;
import com.ibm.tarjeta.models.dto.ClienteListDto;
import com.ibm.tarjeta.models.dto.ClienteUpDto;

public interface ClienteService {

	public List<ClienteListDto> findAll();
	public boolean saveCliente(ClienteCreateDto clienteCreateDto);
	public boolean updateCliente(ClienteUpDto clienteUpDto);
	public void deleteCliente(Long id);
	public ClienteDto findById(Long id);
}
