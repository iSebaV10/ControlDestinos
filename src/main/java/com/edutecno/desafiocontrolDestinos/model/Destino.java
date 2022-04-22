package com.edutecno.desafiocontrolDestinos.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ciudad;
	private String pais;
	private Date fecha;
	
	@ManyToOne()
	@JoinColumn(name = "id_pasajero")//nombre del atributo en la base de datos que se enlaza las tablas 
	private Pasajero pasajero;

	@Override
	public String toString() {
		return "Destino [idDestino=" + id + ", ciudad=" + ciudad + ", Pais=" + pais + ", fecha=" + fecha
				+ "]";
	}
	
	
}
