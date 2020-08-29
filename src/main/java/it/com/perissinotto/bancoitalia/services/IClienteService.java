package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Cliente;

public interface IClienteService {
	public List<Cliente> recuperarTodos();
	public Cliente recuperarPorIdCliente(int idCliente);
	public void adcionarNovoCliente(Cliente novo);
}
