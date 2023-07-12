package cl.awakelab.grupo7.modulo6.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.grupo7.modulo6.servicios.AdministrativoService;
import cl.awakelab.grupo7.modulo6.servicios.ClienteService;
import cl.awakelab.grupo7.modulo6.servicios.ProfesionalService;

@Controller
public class UsuariosController {

	@Autowired
	AdministrativoService administrativoService;
//	@Autowired
//	ClienteService clienteService;
//	@Autowired
//	ProfesionalService profesionalService;
	
	@RequestMapping(value = "/listarUsuarios", method = RequestMethod.GET)
	public ModelAndView mostrarListarAdministrativos() {
		return new ModelAndView("listarUsuarios", "administrativos", administrativoService.getAll());
	}


//	@RequestMapping(value = "/listarUsuarios", method = RequestMethod.GET)
//	public ModelAndView mostrarListarProfesionales() {
//		return new ModelAndView("listarUsuarios", "profesionales", profesionalService.getAll());
//	}
//
//	@RequestMapping(value = "/listarUsuarios", method = RequestMethod.GET)
//	public ModelAndView mostrarListarClientes() {
//		return new ModelAndView("listarUsuarios", "clientes", clienteService.getAll());
//	}

}
