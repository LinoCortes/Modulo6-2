package cl.awakelab.grupo7.modulo6.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cl.awakelab.grupo7.modulo6.modelo.Administrativo;

@Repository
public class AdministrativoDAOImpl implements IAdministrativoDao {

	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override 
	public List<Administrativo> obtenerAdministrativos(){
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, administrativo.area, administrativo.exp_previa\r\n"
				+ "FROM administrativo INNER JOIN usuario ON usuario.id=administrativo.id_usuario;";
		return template.query(sql, new AdministrativoRowMapper());
	}
	
	class AdministrativoRowMapper implements RowMapper<Administrativo>{

		@Override
		public Administrativo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Administrativo (rs.getInt("id"), rs.getString("nombre"), rs.getString("run"), rs.getString("fecha_nacimiento"), rs.getString("area"), rs.getString("exp_previa"));
		}
		
	}
}
