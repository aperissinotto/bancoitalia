package it.com.perissinotto.bancoitalia.dao;

import org.springframework.data.repository.CrudRepository;

import it.com.perissinotto.bancoitalia.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

}
