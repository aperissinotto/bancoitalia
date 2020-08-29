package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Banco;

public interface IBancoService {
	public List<Banco> recuperarTodos();
	public Banco recuperarPorCodigoBanco(int codigoBanco);
	public void adcionarNovoBanco(Banco novo);
}
