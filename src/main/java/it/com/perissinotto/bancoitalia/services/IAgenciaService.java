package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Agencia;

public interface IAgenciaService {
	public List<Agencia> recuperarTodas();
	public Agencia recuperarPorIdAgencia(int idAgencia);
	public void adcionarNovaAgencia(Agencia nova);
}
