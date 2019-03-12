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

import com.ibm.tarjeta.models.dto.AsesorCreateDto;
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
	@Transactional
	public boolean saveAsesor(AsesorCreateDto asesorCreateDto) {
		if(Objects.nonNull(asesorCreateDto)){
			Asesor asesor = this.modelMapper.map(asesorCreateDto, Asesor.class);
			this.asesorRepository.save(asesor);
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateAsesor(AsesorDto asesorDto) {
		Optional<Asesor> asesor = this.asesorRepository.findById(asesorDto.getId());
		if (asesor.isPresent()) {
			if (Strings.isNotEmpty(asesorDto.getNombre())){
				asesor.get().setNombre(asesorDto.getNombre());
			}
			if (Strings.isNotEmpty(asesorDto.getEspecialidad())){
				asesor.get().setEspecialidad(asesorDto.getEspecialidad());
			}			
			this.asesorRepository.save(asesor.get());			
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Transactional
	public void deleteAsesor(Long id) {
		this.asesorRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public AsesorDto findById(Long id) {
		Optional<Asesor> asesor = this.asesorRepository.findById(id);
		if(asesor.isPresent()) {
			return this.modelMapper.map(asesor.get(), AsesorDto.class);
		}
		return null;
	}

}
