package it.com.perissinotto.bancoitalia.services;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.com.perissinotto.bancoitalia.dao.BancoDAO;
import it.com.perissinotto.bancoitalia.model.Banco;

@Component
public class BancoServiceImpl implements IBancoService {
	@Autowired 
	private BancoDAO dao;
	
	@Override
	public List<Banco> recuperarTodos() {
		return (List<Banco>)dao.findAll();
	}
	
	@Override
	public Banco recuperarPorCodigoBanco(int codigoBanco) {
		return dao.findById(codigoBanco).get();
	}
	
	@Override
	public void adcionarNovoBanco(Banco novo) {
		dao.save(novo);
	}
	
}
