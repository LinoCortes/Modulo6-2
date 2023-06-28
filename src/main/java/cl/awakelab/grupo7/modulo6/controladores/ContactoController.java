package cl.awakelab.grupo7.modulo6.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactoController {

	@RequestMapping(value="/contacto", method = RequestMethod.GET)
	public ModelAndView mostrarContacto() {
	    return new ModelAndView("contacto");
	}
}