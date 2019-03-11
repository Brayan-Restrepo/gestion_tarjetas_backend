package com.ibm.tarjeta.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.tarjeta.models.dto.TarjetaDto;
import com.ibm.tarjeta.models.entity.Tarjeta;
import com.ibm.tarjeta.repository.TarjetaRepository;
import com.ibm.tarjeta.service.TarjetaService;

@Service
public class TarjetaServiceImpl implements TarjetaService {

	@Autowired
	private TarjetaRepository tarjetaRepository;

	private ModelMapper modelMapper;
	
	public TarjetaServiceImpl() {
		this.modelMapper = new ModelMapper();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<TarjetaDto> findAll() {
		List<Tarjeta> tarjetaList = (List<Tarjeta>) this.tarjetaRepository.findAll();		
		return tarjetaList.stream().map(tarjeta -> modelMapper.map(tarjeta, TarjetaDto.class)).collect(Collectors.toList());
	}

	@Override
	public boolean saveCliente(TarjetaDto tarjetaDto) {
		return false;
	}

}
