package cl.awakelab.grupo7.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Ejercicio Grupal 3 Modulo 6 
 * Grupo 7
 * 
 * Integrantes:
 * 	Felipe Toro
 * 	Lino Cortes
 * 	Pedro Urbina
 * 	Sergio Morales
 *
 */
@Controller
public class CrearCapacitacionController {
	
	
	@GetMapping({ "/crearCapacitacion" })
	public String getCrearCapacitacion(Model model) {
		return "crearCapacitacion";
	}
	
	@GetMapping({ "/contacto" })
	public String getContacto(Model model) {
		return "contacto";
	}
	
	@GetMapping({ "/", "/index" })
	public String getIndex(Model model) {
		return "index";
	}
}