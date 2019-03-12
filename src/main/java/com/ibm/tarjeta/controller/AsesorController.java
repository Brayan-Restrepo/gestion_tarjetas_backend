package com.ibm.tarjeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.tarjeta.models.dto.AsesorCreateDto;
import com.ibm.tarjeta.models.dto.AsesorDto;
import com.ibm.tarjeta.service.AsesorService;
import com.ibm.tarjeta.util.ConstantesUtil;

@RestController
@RequestMapping(ConstantesUtil.URL_API)
@CrossOrigin(value = "*")
public class AsesorController {

	@Autowired
	private AsesorService asesorService;
	
	
	@GetMapping(ConstantesUtil.ASESORES)
	public List<AsesorDto> listAsesores() {
		return this.asesorService.findAll();
	}
	
	@GetMapping(ConstantesUtil.ASESORES + "/{idAsesor}")
	public AsesorDto asesor(@PathVariable("idAsesor") Long idAsesor) {
		return this.asesorService.findById(idAsesor);
	}
	

	@PostMapping(ConstantesUtil.ASESORES) 
	public boolean saveAsesor(@RequestBody AsesorCreateDto asesorCreateDto){
		try {
			return this.asesorService.saveAsesor(asesorCreateDto);
		} catch (Exception e) {
			return false;
		}
	}
	
	@PutMapping(ConstantesUtil.ASESORES)
	public boolean updateAsesor(@RequestBody AsesorDto asesorDto) {
		try {
			return this.asesorService.updateAsesor(asesorDto);
		} catch (Exception e) {
			return false;
		}		
	}
	
	@DeleteMapping(ConstantesUtil.ASESORES + "/{idAsesor}")
	public boolean deleteAsesor(@PathVariable("idAsesor") Long idAsesor) {
		try {
			this.asesorService.deleteAsesor(idAsesor);
			return true;	
		} catch (Exception e) {
			return false;
		}
	}
}
