package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Banco;

public interface IBancoService {
	public List<Banco> recuperarTodos();
	public Banco recuperarPorIdBanco(int idBanco);
	public void adcionarNovoBanco(Banco novo);
}
