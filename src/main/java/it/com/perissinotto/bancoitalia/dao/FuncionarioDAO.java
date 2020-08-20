package it.com.perissinotto.bancoitalia.dao;

import org.springframework.data.repository.CrudRepository;

import it.com.perissinotto.bancoitalia.model.Funcionario;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer> {

}
