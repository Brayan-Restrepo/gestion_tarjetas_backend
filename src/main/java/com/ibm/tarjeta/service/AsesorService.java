package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.AsesorCreateDto;
import com.ibm.tarjeta.models.dto.AsesorDto;

public interface AsesorService {

	public List<AsesorDto> findAll();
	public boolean saveAsesor(AsesorCreateDto asesorCreateDto);
	public boolean updateAsesor(AsesorDto asesorDto);
	public void deleteAsesor(Long id);
	public AsesorDto findById(Long id);
}
