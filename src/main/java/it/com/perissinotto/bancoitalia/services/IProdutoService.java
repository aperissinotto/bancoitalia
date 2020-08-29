package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPorIdProduto(int idProduto);
	public void adcionarNovoProduto(Produto novo);
}
