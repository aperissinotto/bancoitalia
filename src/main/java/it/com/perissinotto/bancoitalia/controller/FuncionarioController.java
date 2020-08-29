package it.com.perissinotto.bancoitalia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.com.perissinotto.bancoitalia.model.Funcionario;
import it.com.perissinotto.bancoitalia.services.IFuncionarioService;

@RestController
@CrossOrigin("*")
public class FuncionarioController {
	@Autowired
	private IFuncionarioService servico;

	@GetMapping("/funcionarios")
	public ResponseEntity<List<Funcionario>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/funcionario/{idFuncionario}")
	public ResponseEntity<Funcionario> mostrarPeloIdFuncionario(@PathVariable int idFuncionario) {
		Funcionario f = servico.recuperarPorIdFuncionario(idFuncionario);
		if (f != null) {
			return ResponseEntity.ok(f);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/funcionario/novo")
	public ResponseEntity<Funcionario> inserirNovoFuncionario(@RequestBody Funcionario novo) {
		try {
			servico.adcionarNovoFuncionario(novo);
			return ResponseEntity.status(201).body(novo);
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
