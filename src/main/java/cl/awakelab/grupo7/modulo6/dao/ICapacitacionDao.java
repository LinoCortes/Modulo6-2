package cl.awakelab.grupo7.modulo6.dao;

import java.util.List;

import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;

public interface ICapacitacionDao {
	public List<Capacitacion> obtenerCapacitaciones(); 
	  
	public Boolean crearCapacitaciones(Capacitacion capacitacion); 
}
