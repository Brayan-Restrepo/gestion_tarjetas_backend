package com.ibm.tarjeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
