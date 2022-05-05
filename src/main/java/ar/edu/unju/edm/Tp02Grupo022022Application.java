package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto5;
import ar.edu.unju.edm.model.Punto6;

@SpringBootApplication
public class Tp02Grupo022022Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Tp02Grupo022022Application.class, args);
		Punto5 conver = new Punto5("Hola Mundo!");		
		System.out.println("es:"+conver.Cadena());
		
	}

}
