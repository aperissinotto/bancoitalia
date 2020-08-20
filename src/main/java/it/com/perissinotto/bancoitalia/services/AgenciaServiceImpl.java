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
	public List<Agencia> recuperarTodos() {
		return (List<Agencia>)dao.findAll();
	}
	
	@Override
	public Agencia recuperarPorCodigoAgencia(int codigoAgencia) {
		return dao.findById(codigoAgencia).get();
	}
}
