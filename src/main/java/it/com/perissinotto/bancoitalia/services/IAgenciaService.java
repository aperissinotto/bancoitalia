package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Agencia;

public interface IAgenciaService {
	public List<Agencia> recuperarTodos();
	public Agencia recuperarPorCodigoAgencia(int codigoAgencia);
}
