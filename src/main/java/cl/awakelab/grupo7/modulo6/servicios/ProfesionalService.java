package cl.awakelab.grupo7.modulo6.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.grupo7.modulo6.dao.ProfesionalDAOImpl;
import cl.awakelab.grupo7.modulo6.modelo.Profesional;

@Service
public class ProfesionalService {
	@Autowired
	ProfesionalDAOImpl profesionalDAOImpl;
	
	public List<Profesional> getAll(){
		return profesionalDAOImpl.obtenerProfesionales();
	}
}


