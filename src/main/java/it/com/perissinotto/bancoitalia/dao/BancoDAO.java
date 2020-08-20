package it.com.perissinotto.bancoitalia.dao;

import org.springframework.data.repository.CrudRepository;

import it.com.perissinotto.bancoitalia.model.Banco;

public interface BancoDAO extends CrudRepository<Banco, Integer> {

}
