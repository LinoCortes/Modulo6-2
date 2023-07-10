package cl.awakelab.grupo7.modulo6.controladores;

import cl.awakelab.grupo7.modulo6.modelo.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class ContactoController {

	@RequestMapping(value="/contacto", method = RequestMethod.GET)
	public ModelAndView mostrarContacto() {

		return new ModelAndView("contacto");
	}

	@RequestMapping(value="/contacto", method = RequestMethod.POST)
	public String enviarContacto(@ModelAttribute("contacto") Contacto contacto) throws SQLException {
		System.out.println(contacto.toString());
		return "redirect:/";
	}

}