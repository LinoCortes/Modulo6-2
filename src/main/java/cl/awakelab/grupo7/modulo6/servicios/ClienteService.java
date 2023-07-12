package cl.awakelab.grupo7.modulo6.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.grupo7.modulo6.dao.ClienteDAOImpl;
import cl.awakelab.grupo7.modulo6.modelo.Cliente;

@Service
public class ClienteService {
	
	@Autowired 
	ClienteDAOImpl clienteDAOImpl;
	
	
	public List<Cliente> getAll(){
		return clienteDAOImpl.obtenerClientes();

	}
}
