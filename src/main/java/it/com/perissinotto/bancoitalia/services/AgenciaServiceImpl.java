package it.com.perissinotto.bancoitalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.com.perissinotto.bancoitalia.dao.AgenciaDAO;
import it.com.perissinotto.bancoitalia.model.Agencia;

@Component
public class AgenciaServiceImpl implements IAgenciaService {
	@Autowired 
	private AgenciaDAO dao;
	
	@Override
	public List<Agencia> recuperarTodas() {
		return (List<Agencia>)dao.findAll();
	}
	
	@Override
	public Agencia recuperarPorIdAgencia(int idAgencia) {
		return dao.findById(idAgencia).get();
	}
	
	@Override
	public void adcionarNovaAgencia(Agencia nova) {
		dao.save(nova);
	}
}
