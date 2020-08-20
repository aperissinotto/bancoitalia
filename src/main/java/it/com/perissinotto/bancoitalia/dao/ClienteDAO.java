package it.com.perissinotto.bancoitalia.dao;

import org.springframework.data.repository.CrudRepository;

import it.com.perissinotto.bancoitalia.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}
