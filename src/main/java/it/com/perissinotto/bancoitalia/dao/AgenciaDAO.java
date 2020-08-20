package it.com.perissinotto.bancoitalia.dao;

import org.springframework.data.repository.CrudRepository;

import it.com.perissinotto.bancoitalia.model.Agencia;

public interface AgenciaDAO extends CrudRepository<Agencia, Integer> {

}
