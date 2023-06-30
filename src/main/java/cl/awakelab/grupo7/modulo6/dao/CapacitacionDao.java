package cl.awakelab.grupo7.modulo6.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;

@Service
public class CapacitacionDao implements ICapacitacionDao {

	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		
		List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
		
		capacitaciones.add(new Capacitacion(1,1,3,5,"16432","Prevencion de riesgos","Lunes","12:33","GAM"));
		capacitaciones.add(new Capacitacion(2,1,3,5,"16512","Prevencion de mas riesgos","Martes","12:30","Pamplona"));
		capacitaciones.add(new Capacitacion(3,1,3,5,"75146","Prevencion de aun mas riesgos","Miercoles","11:33","Mall arauco"));
		
		return capacitaciones;
	}

	@Override
	public Boolean crearCapacitaciones(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
