package com.ibm.tarjeta.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.tarjeta.models.dto.ClienteDto;
import com.ibm.tarjeta.models.entity.Cliente;
import com.ibm.tarjeta.repository.ClienteRepository;
import com.ibm.tarjeta.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	private ModelMapper modelMapper;
	
	public ClienteServiceImpl() {
		this.modelMapper = new ModelMapper();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<ClienteDto> findAll() {
		List<Cliente> clienteList = (List<Cliente>) this.clienteRepository.findAll();		
		return clienteList.stream().map(cliente -> modelMapper.map(cliente, ClienteDto.class)).collect(Collectors.toList());
	}

	@Override
	public boolean saveCliente(ClienteDto clienteDto) {
		return false;
	}

	@Override
	public boolean updateCliente(ClienteDto clienteDto) {
		return false;
	}

	@Override
	public boolean deleteCliente(Long id) {
		return false;
	}

}
