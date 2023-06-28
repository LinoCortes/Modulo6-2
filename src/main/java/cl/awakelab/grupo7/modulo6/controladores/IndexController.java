package cl.awakelab.grupo7.modulo6.controladores;

import org.springframework.stereotype.Controller;
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
public class IndexController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView mostrarIndex() {
	    return new ModelAndView("index");
	}
}