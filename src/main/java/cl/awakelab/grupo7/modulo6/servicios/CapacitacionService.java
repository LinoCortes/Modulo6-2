package cl.awakelab.grupo7.modulo6.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.grupo7.modulo6.dao.CapacitacionDAOImpl;
import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;

@Service
public class CapacitacionService {
	
	@Autowired
	CapacitacionDAOImpl capacitacionDAOImpl;
	
	public List<Capacitacion> getAll(){
		return capacitacionDAOImpl.obtenerCapacitaciones();
	} 
}
