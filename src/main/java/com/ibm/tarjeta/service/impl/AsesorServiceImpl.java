package com.ibm.tarjeta.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.tarjeta.models.dto.AsesorDto;
import com.ibm.tarjeta.models.entity.Asesor;
import com.ibm.tarjeta.repository.AsesorRepository;
import com.ibm.tarjeta.service.AsesorService;

@Service
public class AsesorServiceImpl implements AsesorService {

	@Autowired
	private AsesorRepository asesorRepository;

	private ModelMapper modelMapper;
	
	public AsesorServiceImpl() {
		this.modelMapper = new ModelMapper();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<AsesorDto> findAll() {
		List<Asesor> asesorList = (List<Asesor>) this.asesorRepository.findAll();		
		return asesorList.stream().map(asesor -> modelMapper.map(asesor, AsesorDto.class)).collect(Collectors.toList());
	}

	@Override
	public boolean saveAsesor(AsesorDto asesorDto) {
		return false;
	}

	@Override
	public boolean updateAsesor(AsesorDto asesorDto) {
		return false;
	}

	@Override
	public boolean deleteAsesor(Long id) {
		return false;
	}

	@Override
	public AsesorDto findById(Long id) {
		Optional<Asesor> asesor = this.asesorRepository.findById(id);
		if(asesor.isPresent()) {
			return this.modelMapper.map(asesor.get(), AsesorDto.class);
		}
		return null;
	}

}
