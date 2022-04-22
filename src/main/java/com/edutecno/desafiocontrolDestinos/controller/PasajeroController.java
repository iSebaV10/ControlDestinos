package com.edutecno.desafiocontrolDestinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edutecno.desafiocontrolDestinos.model.Pasajero;
import com.edutecno.desafiocontrolDestinos.service.DestinoServiceImpl;
import com.edutecno.desafiocontrolDestinos.service.PasajeroServiceImpl;



@Controller
public class PasajeroController {

	@Autowired
	DestinoServiceImpl destinoServiceImpl;
	
	@Autowired
	PasajeroServiceImpl pasajeroServiceImpl;
	
	@GetMapping("/pasajeros")
	public String listarPasajeros(Model model) {
		 
		model.addAttribute("pasajeros", pasajeroServiceImpl.findAll().getPasajeros());
		
		return "pasajeros";
		
	}
	
	@GetMapping("/formularioPasajero")
	public String formularioPasajero() {
		
		return "crear-pasajero";
	}
	
	@PostMapping("/agregarPasajero")
	public String agregarDestino(@ModelAttribute Pasajero pasajero) {
		
		pasajeroServiceImpl.insert(pasajero);
		return formularioPasajero();
		
	}
}
