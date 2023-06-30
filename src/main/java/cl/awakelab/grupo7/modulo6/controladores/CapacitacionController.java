package cl.awakelab.grupo7.modulo6.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.grupo7.modulo6.dao.CapacitacionDao;
import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;

@Controller
public class CapacitacionController {
	
	@Autowired
	CapacitacionDao capacitacionDAO;
	
	@RequestMapping(value="/crearCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarCrearCapacitacion() {
	    return new ModelAndView("crearCapacitacion");
	}
	
	@RequestMapping(value="/crearCapacitacion", method = RequestMethod.POST)
	public String crearCapacitacion(@ModelAttribute("capacitacion") Capacitacion capacitacion) {
		System.out.println(capacitacion.toString());
	    return "redirect:/listarCapacitacion"; // Rediriges al usuario a la lista de capacitaciones
	}
	
	@RequestMapping(value="/listarCapacitacion", method = RequestMethod.GET)
	public ModelAndView mostrarListarCapacitaciones() {
		
		return new ModelAndView("listarCapacitacion", "capacitaciones", capacitacionDAO.obtenerCapacitaciones());
	}
}