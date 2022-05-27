package com.bios.sistemafeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bios.sistemafeedback.repository.VeiculoRepository;

@Controller
@RequestMapping("/feedback")
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;

	/**
	 * Validação do veículo com uso de AJAX
	 */
	@GetMapping("validarNrSerieVeiculo")
	public @ResponseBody String validarVeiculo(@RequestParam("nrVeiculo") Long id) {
		// *lógica*
		return null;
	}

}
