package cl.awakelab.grupo7.modulo6.dao;

import java.sql.SQLException;
import java.util.List;

import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;

public interface ICapacitacionDao {
	List<Capacitacion> obtenerCapacitaciones();
	  
	Boolean crearCapacitaciones(Capacitacion capacitacion) throws SQLException;
}
