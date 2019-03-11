package com.ibm.tarjeta.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.tarjeta.models.dto.ConsumoDto;
import com.ibm.tarjeta.models.entity.Consumo;
import com.ibm.tarjeta.repository.ConsumoRepository;
import com.ibm.tarjeta.service.ConsumoService;

@Service
public class ConsumoServiceImpl implements ConsumoService {

	@Autowired
	private ConsumoRepository consumoRepository;

	private ModelMapper modelMapper;
	
	public ConsumoServiceImpl() {
		this.modelMapper = new ModelMapper();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<ConsumoDto> findAll() {
		List<Consumo> consumoList = (List<Consumo>) this.consumoRepository.findAll();		
		return consumoList.stream().map(consumo -> modelMapper.map(consumo, ConsumoDto.class)).collect(Collectors.toList());
	}

	@Override
	public boolean saveCliente(ConsumoDto consumoDto) {
		return false;
	}

}
