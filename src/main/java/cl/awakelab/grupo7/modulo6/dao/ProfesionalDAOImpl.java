package cl.awakelab.grupo7.modulo6.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cl.awakelab.grupo7.modulo6.modelo.Profesional;

@Repository
public class ProfesionalDAOImpl {
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Profesional> obtenerProfesionales() {
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, profesional.titulo, profesional.fecha_ingreso\r\n"
				+ "FROM profesional\r\n" + "INNER JOIN usuario ON usuario.id=profesional.id_usuario;";
		return template.query(sql, new ProfesionalRowMapper());
	}

	class ProfesionalRowMapper implements RowMapper<Profesional>{

		@Override
		public Profesional mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Profesional(rs.getInt("id"), rs.getString("nombre"), rs.getString("run"), rs.getString("fecha_nacimiento"), rs.getString("titulo"), rs.getString("fecha_ingreso"));
		}
		
	}
	
	
}
