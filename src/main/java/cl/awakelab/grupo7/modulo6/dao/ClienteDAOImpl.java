package cl.awakelab.grupo7.modulo6.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cl.awakelab.grupo7.modulo6.modelo.Cliente;



@Repository
public class ClienteDAOImpl {
	
	@Autowired
	JdbcTemplate template;

	public List<Cliente> obtenerClientes() {
		String sql = "SELECT usuario.id, usuario.nombre, usuario.run, usuario.fecha_nacimiento, cliente.rut, cliente.edad, cliente.apellido, cliente.telefono, cliente.afp, cliente.direccion, cliente.comuna\r\n"
				+ "FROM cliente\r\n" + "INNER JOIN usuario ON usuario.id=cliente.id_usuario;";
		return template.query(sql, new ClientesRowMapper() );
	}
	
	
	class ClientesRowMapper implements RowMapper<Cliente>{

		@Override
		public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
			return  new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("run"), rs.getInt("edad"), rs.getString("rut"), rs.getString("fecha_nacimiento"), rs.getString("apellido"),
					rs.getString("telefono"), rs.getString("afp"), rs.getString("direccion"), rs.getString("comuna"));
		}
		
		
	}

}
