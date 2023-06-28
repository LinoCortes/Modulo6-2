package cl.awakelab.grupo7.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CapacitacionController {
	
	@RequestMapping(value="/crearCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarCrearCapacitacion() {
	    return new ModelAndView("crearCapacitacion");
	}
	
	@RequestMapping(value="/listarCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarListarCapacitaciones() {
	    return new ModelAndView("listarCapacitacion");
	}
}