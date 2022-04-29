package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Alumno;
import ar.edu.unju.edm.until.ListadoAlumno;

@Controller
public class AlumnoController {
	@GetMapping ("/mostrarAlumnos")
	public String getListado(Model model) {
    //creacion del alumno  
	 Alumno alumno1 =new Alumno("Santiago","Colque",LocalDate.now(),44949761,388477659);
	 Alumno alumno2 =new Alumno("Tomas","Gomez",LocalDate.of(2003,7,9),44912589,388477659);
	 Alumno alumno3 =new Alumno("Marcos","Quinteros",LocalDate.parse("2003-12-27"),45085907,388477659);
	 Alumno alumno4 =new Alumno("Agustina","Maraz",LocalDate.of(2003,7,23),44949820,388477659);
	 
	 //Agregar alumno al litado 
	 ListadoAlumno nombre = new ListadoAlumno();
	 nombre.getListado().add(alumno1);
	 nombre.getListado().add(alumno2);
	 nombre.getListado().add(alumno3);
	 nombre.getListado().add(alumno4);
	 
	 //Enviar listado a la vista
	 model.addAttribute("listadoAlumno", nombre.getListado());
	 return  "punto7tp02" ;
	}	 
}
