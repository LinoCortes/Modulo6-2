package cl.awakelab.grupo7.modulo6.dao;

import java.sql.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import cl.awakelab.grupo7.modulo6.modelo.Capacitacion;

@Repository
public class CapacitacionDAOImpl implements ICapacitacionDao {

	@Autowired
	JdbcTemplate template; 

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		
		String sql = "SELECT * FROM capacitaciones";
		return template.query(sql, new CapacitacionRowMapper());
	}

	@Override
	public Boolean crearCapacitaciones(Capacitacion capacitacion) throws SQLException {
		String sql = "Insert into  capacitaciones (identificador,duracion,cantidadAsistentes,tematica,rutCliente,dia,hora,lugar) values (?.?.?.?.?.?.?.?)";
		template.update(sql, capacitacion.getIdentificador(),capacitacion.getDuracion(),capacitacion.getCantidadAsistentes(),capacitacion.getTematica(),capacitacion.getRutCliente(),capacitacion.getDia(),capacitacion.getHora(),capacitacion.getLugar());
		return true;
	}
	
	class CapacitacionRowMapper implements RowMapper<Capacitacion>{
		
		@Override
		public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Capacitacion(rs.getInt("id"),rs.getInt("identificador"),rs.getInt("duracion"),
					rs.getInt("cantidadAsistentes"),rs.getString("tematica"),rs.getString("rutCliente"),
					rs.getString("dia"),rs.getString("hora"),rs.getString("lugar"));
		}
	}
}
