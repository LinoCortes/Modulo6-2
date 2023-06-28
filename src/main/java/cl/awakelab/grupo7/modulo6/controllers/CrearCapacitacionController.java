package cl.awakelab.grupo7.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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
	
//	@RequestMapping(path="/contacto", method = RequestMethod.GET)
//	public ModelAndView mostrarIndex() {
//	    return new ModelAndView("index");
//	}
//	
//	@RequestMapping(path="/", method = RequestMethod.GET)
//	public ModelAndView mostrarIndex() {
//	    return new ModelAndView("index");
//	}
}
