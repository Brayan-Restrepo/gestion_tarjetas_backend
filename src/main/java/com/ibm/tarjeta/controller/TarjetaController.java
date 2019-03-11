package com.ibm.tarjeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.tarjeta.models.dto.TarjetaDto;
import com.ibm.tarjeta.service.TarjetaService;
import com.ibm.tarjeta.util.ConstantesUtil;

@RestController
@RequestMapping(ConstantesUtil.URL_API)
@CrossOrigin(value = "*")
public class TarjetaController {

	@Autowired
	private TarjetaService tarjetaService;
	
	@GetMapping(ConstantesUtil.TARJETAS)
	public List<TarjetaDto> listTarjetas() {
		return this.tarjetaService.findAll();
	}
	
}
