package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.com.perissinotto.bancoitalia.dao.FuncionarioDAO;
import it.com.perissinotto.bancoitalia.model.Funcionario;

@Component
public class FuncionarioServiceImpl implements IFuncionarioService {
	@Autowired 
	private FuncionarioDAO dao;
	
	@Override
	public List<Funcionario> recuperarTodos() {
		return (List<Funcionario>)dao.findAll();
	}
	
	@Override
	public Funcionario recuperarPorIdFuncionario(int idFuncionario) {
		return dao.findById(idFuncionario).get();
	}
	
	@Override
	public void adcionarNovoFuncionario(Funcionario novo) {
		dao.save(novo);
	}
}
