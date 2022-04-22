package com.edutecno.desafiocontrolDestinos.vo;

import java.util.List;

import com.edutecno.desafiocontrolDestinos.model.Destino;

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
public class DestinoVO extends GenericVO{

	private List<Destino> destinos;

	public DestinoVO(List<Destino> destinos, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.destinos = destinos;
	}
	
	
}
