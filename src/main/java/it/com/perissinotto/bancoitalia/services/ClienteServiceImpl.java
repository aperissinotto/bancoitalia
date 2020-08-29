package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.com.perissinotto.bancoitalia.dao.ClienteDAO;
import it.com.perissinotto.bancoitalia.model.Cliente;

@Component
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private ClienteDAO dao;

	@Override
	public List<Cliente> recuperarTodos() {
		return (List<Cliente>) dao.findAll();
	}

	@Override
	public Cliente recuperarPorIdCliente(int idCliente) {
		return dao.findById(idCliente).get();
	}

	@Override
	public void adcionarNovoCliente(Cliente novo) {
		dao.save(novo);
	}
}
