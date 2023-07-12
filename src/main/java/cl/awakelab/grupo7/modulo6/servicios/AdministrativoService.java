package cl.awakelab.grupo7.modulo6.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.awakelab.grupo7.modulo6.dao.AdministrativoDAOImpl;
import cl.awakelab.grupo7.modulo6.modelo.Administrativo;

public class AdministrativoService {
	@Autowired
	AdministrativoDAOImpl administrativoDAOImpl;
	
	public List<Administrativo> getAll(){
		return administrativoDAOImpl.obtenerAdministrativos();
	}

}
