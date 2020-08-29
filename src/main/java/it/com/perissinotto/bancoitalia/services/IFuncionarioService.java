package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import it.com.perissinotto.bancoitalia.model.Funcionario;

public interface IFuncionarioService {
	public List<Funcionario> recuperarTodos();
	public Funcionario recuperarPorIdFuncionario(int idFuncionario);
	public void adcionarNovoFuncionario(Funcionario novo);
}
