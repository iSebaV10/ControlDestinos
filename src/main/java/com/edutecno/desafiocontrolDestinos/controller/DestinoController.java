package com.edutecno.desafiocontrolDestinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edutecno.desafiocontrolDestinos.model.Destino;
import com.edutecno.desafiocontrolDestinos.service.DestinoServiceImpl;
import com.edutecno.desafiocontrolDestinos.service.PasajeroServiceImpl;



@Controller
public class DestinoController {

	@Autowired
	DestinoServiceImpl destinoServiceImpl;
	
	@Autowired
	PasajeroServiceImpl pasajeroServiceImpl;
	
	@GetMapping("/destinos")
	public String listarDestinos(Model model) {
		 
		model.addAttribute("destinos", destinoServiceImpl.findAll().getDestinos());
		
		
		return "destinos";
		
	}
	
	@GetMapping("/formularioDestino")
	public String formularioDestino(Model model) {
		model.addAttribute("pasajeros", pasajeroServiceImpl.findAll().getPasajeros());
		return "crear-destino";
	}
	
	@PostMapping("/agregarDestino")
	public String agregarDestino(Model model,@ModelAttribute Destino destino ) {
		
		destinoServiceImpl.insert(destino);
		return formularioDestino(model);
		
	}
}
