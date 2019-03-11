package com.ibm.tarjeta.service;

import java.util.List;

import com.ibm.tarjeta.models.dto.AsesorDto;

public interface AsesorService {

	public List<AsesorDto> findAll();
	public boolean saveAsesor(AsesorDto asesorDto);
	public boolean updateAsesor(AsesorDto asesorDto);
	public boolean deleteAsesor(Long id);
	public AsesorDto findById(Long id);
}
