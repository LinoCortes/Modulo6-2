package cl.awakelab.grupo7.modulo6.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;
import cl.awakelab.grupo7.modulo6.servicios.CapacitacionService;

import java.sql.SQLException;

@Controller
public class CapacitacionController {
	
	@Autowired
	CapacitacionService capacitacionService;
	
	@RequestMapping(value="/crearCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarCrearCapacitacion() {
	    return new ModelAndView("crearCapacitacion");
	}
	
	@RequestMapping(value="/crearCapacitacion", method = RequestMethod.POST)
	public String crearCapacitacion(@ModelAttribute("capacitacion") Capacitacion capacitacion) throws SQLException {
		capacitacionService.createCapacitacion(capacitacion);
		return "redirect:/listarCapacitacion";
	}
	
	@RequestMapping(value="/listarCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarListarCapacitaciones() {
		return new ModelAndView("listarCapacitacion", "capacitaciones", capacitacionService.getAll());
	}
}