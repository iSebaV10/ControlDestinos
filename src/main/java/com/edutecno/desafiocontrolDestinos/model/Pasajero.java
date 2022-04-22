package com.edutecno.desafiocontrolDestinos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String ciudadNatal;
	
	@OneToMany(mappedBy= "pasajero", fetch = FetchType.EAGER)
	private List<Destino> destino;

	@Override
	public String toString() {
		return "Pasajero [rutPasajero=" + rut + ", idPasajero=" + id + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", ciudadNatal=" + ciudadNatal + ", destinos="
				+ destino + "]";
	}
	
	
	
}
