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

import com.ibm.tarjeta.models.dto.ClienteDto;
import com.ibm.tarjeta.models.dto.ClienteUpDto;
import com.ibm.tarjeta.service.ClienteService;
import com.ibm.tarjeta.util.ConstantesUtil;

@RestController
@RequestMapping(ConstantesUtil.URL_API)
@CrossOrigin(value = "*")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping(ConstantesUtil.CLIENTES)
	public List<ClienteDto> listClientes() {
		return this.clienteService.findAll();
	}
	
	@PostMapping(ConstantesUtil.CLIENTES) 
	public boolean saveCliente(@RequestBody ClienteDto clienteDto){
		return this.clienteService.saveCliente(clienteDto);
	}
	
	@PutMapping(ConstantesUtil.CLIENTES)
	public boolean updateCliente(@RequestBody ClienteUpDto clienteUpDto) {
		return this.clienteService.updateCliente(clienteUpDto);
	}
	
	@DeleteMapping(ConstantesUtil.CLIENTES + "/{idCliente}")
	public boolean deleteCliente(@PathVariable("idCliente") Long idCliente) {
		try {
			this.clienteService.deleteCliente(idCliente);
			return true;	
		} catch (Exception e) {
			return false;
		}
	}
}
