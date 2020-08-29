package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.com.perissinotto.bancoitalia.dao.ProdutoDAO;
import it.com.perissinotto.bancoitalia.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {
	@Autowired
	private ProdutoDAO dao;

	@Override
	public List<Produto> recuperarTodos() {
		return (List<Produto>) dao.findAll();
	}

	@Override
	public Produto recuperarPorIdProduto(int idProduto) {
		return dao.findById(idProduto).get();
	}

	@Override
	public void adcionarNovoProduto(Produto novo) {
		dao.save(novo);
	}
}
