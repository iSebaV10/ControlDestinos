package com.edutecno.desafiocontrolDestinos.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.desafiocontrolDestinos.model.Pasajero;
import com.edutecno.desafiocontrolDestinos.repository.PasajeroRepository;
import com.edutecno.desafiocontrolDestinos.vo.PasajeroVO;


@Service
public class PasajeroServiceImpl implements IService<PasajeroVO, Pasajero> {

	@Autowired
	PasajeroRepository pasajeroRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(PasajeroServiceImpl.class);
	
	private PasajeroVO pasajeroVO;
	@Override
	public PasajeroVO findAll() {
		// TODO Auto-generated method stub
		pasajeroVO = new PasajeroVO(new ArrayList<Pasajero>(), "101", "Error al encontrar los pasajeros");
		try {
			
			pasajeroVO.setPasajeros((List<Pasajero>) pasajeroRepo.findAll());
			pasajeroVO.setMensaje(String.format("Pasajeros listados con exito. se han encontrado %d registros", ((List<Pasajero>) pasajeroRepo.findAll()).size()));
			pasajeroVO.setCodigo("200");
		} catch (Exception e) {
			logger.error("PasajeroServiceImpl: findAll: " + e);
			
		}
		
		return pasajeroVO;
	}

	@Override
	public PasajeroVO findById(Pasajero id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PasajeroVO insert(Pasajero pasajero) {
		// TODO Auto-generated method stub
		pasajeroVO = new PasajeroVO(new ArrayList<Pasajero>(), "102", "Error al agregar el pasajero");
		try {
			pasajeroRepo.save(pasajero);
			pasajeroVO.setPasajeros(new ArrayList<Pasajero>());
			pasajeroVO.setMensaje(String.format("Pasajero con rut: %d agregado con exito", pasajeroRepo.save(pasajero).getRut()));
			pasajeroVO.setCodigo("201");
		} catch (Exception e) {
			logger.error("PasajeroerviceImpl: insert: " + e);
			
		}
		
		return pasajeroVO;
	}

}
