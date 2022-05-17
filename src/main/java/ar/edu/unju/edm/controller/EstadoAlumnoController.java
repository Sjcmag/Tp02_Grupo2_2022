package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.EstadoAlumno;

@Controller
public class EstadoAlumnoController {
	@GetMapping("/punto03")
	public String getPunto03page(Model model) {
		EstadoAlumno punto3 = new EstadoAlumno();
		punto3.setNombre("Santiago");
		punto3.setApellido("Colque");
		punto3.setLibreta(1000);
		
		model.addAttribute("Nombre",punto3.getNombre());
		model.addAttribute("Apellido",punto3.getApellido());
		model.addAttribute("Libreta",punto3.getLibreta());
		model.addAttribute("Promedio",punto3.calcularPromedio());
		model.addAttribute("NotaMaxima",punto3.conseguirNotaMaxima());
		return "Punto3tp02";
	}

}
