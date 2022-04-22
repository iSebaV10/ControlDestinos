package com.edutecno.desafiocontrolDestinos.vo;

import java.util.List;

import com.edutecno.desafiocontrolDestinos.model.Pasajero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PasajeroVO extends GenericVO{

	private List<Pasajero> pasajeros;

	public PasajeroVO(List<Pasajero> pasajeros,String mensaje, String codigo) {
		super(mensaje, codigo);
		this.pasajeros = pasajeros;
	}
	
	
}
