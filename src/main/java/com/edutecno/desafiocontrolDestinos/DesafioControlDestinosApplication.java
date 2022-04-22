package com.edutecno.desafiocontrolDestinos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edutecno.desafiocontrolDestinos.model.Pasajero;
import com.edutecno.desafiocontrolDestinos.repository.DestinoRepository;
import com.edutecno.desafiocontrolDestinos.repository.PasajeroRepository;

@SpringBootApplication
public class DesafioControlDestinosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioControlDestinosApplication.class, args);
	}

}
