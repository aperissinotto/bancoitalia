package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Agencia;
import it.com.perissinotto.bancoitalia.model.Banco;

public interface IAgenciaService {
	public List<Agencia> recuperarTodos();
	public Agencia recuperarPorIdAgencia(int idAgencia);
	public void adcionarNovaAgencia(Agencia nova);
}
