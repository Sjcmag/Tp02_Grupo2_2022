package ar.edu.unju.edm.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component 
public class Persona {
   private  LocalDate fecha ;
   public Persona() {
	// TODO Auto-generated constructor stub
}
public Persona(LocalDate fecha) {
	super();
	this.fecha = fecha;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
   public String getEdad() {
	   fecha.of(2003, 9, 7);
	   LocalDate fechaHoy =LocalDate.now();
	   int edad = fechaHoy.getYear() - fecha.getYear();
	   
	   
	   return "la edad es:";
	   
   }
   
}
