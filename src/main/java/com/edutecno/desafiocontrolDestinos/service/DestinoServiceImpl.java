package com.edutecno.desafiocontrolDestinos.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.desafiocontrolDestinos.model.Destino;
import com.edutecno.desafiocontrolDestinos.repository.DestinoRepository;
import com.edutecno.desafiocontrolDestinos.vo.DestinoVO;


@Service
public class DestinoServiceImpl implements IService<DestinoVO, Destino>{

	@Autowired
	DestinoRepository destinoRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(DestinoServiceImpl.class);
	
	private DestinoVO destinoVO;
	
	@Override
	public DestinoVO findAll() {
		// TODO Auto-generated method stub
		destinoVO = new DestinoVO(new ArrayList<Destino>(), "Error al encontrar los detinos", "102");
		
		try {
			destinoVO.setDestinos((List<Destino>) destinoRepo.findAll());
			destinoVO.setMensaje(String.format("Destinos listados con exito. %d registros encontrados", ((List<Destino>) destinoRepo.findAll()).size()));
			destinoVO.setCodigo("200");
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("DestinoServiceImpl: findAll: " + e);
		}
		return destinoVO;
	}

	@Override
	public DestinoVO findById(Destino id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DestinoVO insert(Destino destino) {
		// TODO Auto-generated method stub
destinoVO = new DestinoVO(new ArrayList<Destino>(), "Error al encontrar los detinos", "102");
		
		try {
			destinoRepo.save(destino);
			destinoVO.setDestinos(new ArrayList<Destino>());
			destinoVO.setMensaje("Destino agregado con exito");
			destinoVO.setCodigo("201");
			
		} catch (Exception e) {
			logger.error("DestinoServiceImpl: insert: " + e);
		}
		
		return destinoVO;
	}

}
