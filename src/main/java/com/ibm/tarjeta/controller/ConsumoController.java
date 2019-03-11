package com.ibm.tarjeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.tarjeta.models.dto.ConsumoDto;
import com.ibm.tarjeta.service.ConsumoService;
import com.ibm.tarjeta.util.ConstantesUtil;

@RestController
@RequestMapping(ConstantesUtil.URL_API)
@CrossOrigin(value = "*")
public class ConsumoController {
	
	@Autowired
	private ConsumoService consumoService;
	
	@GetMapping(ConstantesUtil.CONSUMOS)
	public List<ConsumoDto> listConsumos() {
		return this.consumoService.findAll();
	}

}
