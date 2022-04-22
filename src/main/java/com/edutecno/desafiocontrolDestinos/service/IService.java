package com.edutecno.desafiocontrolDestinos.service;

import com.edutecno.desafiocontrolDestinos.model.Destino;
import com.edutecno.desafiocontrolDestinos.vo.DestinoVO;

public interface IService <ClaseVO, Clase> {

	public ClaseVO findAll();
	public ClaseVO findById(Clase entidad);
	public ClaseVO insert(Clase entidad);
}
