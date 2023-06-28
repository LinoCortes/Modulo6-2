package cl.awakelab.grupo7.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrearCapacitacionController {
	
	@RequestMapping(value="/crearCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarCrearCapacitacion() {
	    return new ModelAndView("crearCapacitacion");
	}
}
