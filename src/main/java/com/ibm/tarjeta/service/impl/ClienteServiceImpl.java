package com.ibm.tarjeta.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.tarjeta.models.dto.ClienteCreateDto;
import com.ibm.tarjeta.models.dto.ClienteDto;
import com.ibm.tarjeta.models.dto.ClienteUpDto;
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
	@Transactional
	public boolean saveCliente(ClienteCreateDto clienteCreateDto) {
		if(Objects.nonNull(clienteCreateDto)){
			Cliente cliente = this.modelMapper.map(clienteCreateDto, Cliente.class);
			this.clienteRepository.save(cliente);
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateCliente(ClienteUpDto clienteUpDto) {
		Optional<Cliente> cliente = this.clienteRepository.findById(clienteUpDto.getId());
		if (cliente.isPresent()) {
			if (Strings.isNotEmpty(clienteUpDto.getCiudad())){
				cliente.get().setCiudad(clienteUpDto.getCiudad());				
			}
			if (Strings.isNotEmpty(clienteUpDto.getDireccion())){
				cliente.get().setDireccion(clienteUpDto.getDireccion());
			}
			if (Strings.isNotEmpty(clienteUpDto.getNombre())){
				cliente.get().setNombre(clienteUpDto.getNombre());
			}
			if (Strings.isNotEmpty(clienteUpDto.getTelefono())){
				cliente.get().setTelefono(clienteUpDto.getTelefono());
			}			
			this.clienteRepository.save(cliente.get());			
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deleteCliente(Long id) {
		this.clienteRepository.deleteById(id);
	}

}
