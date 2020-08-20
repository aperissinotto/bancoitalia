package it.com.perissinotto.bancoitalia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.com.perissinotto.bancoitalia.model.Agencia;
import it.com.perissinotto.bancoitalia.services.IAgenciaService;

@RestController
@CrossOrigin("*")
public class AgenciaController {
	@Autowired
	private IAgenciaService servico;

	@GetMapping("/agencias")
	public ResponseEntity<List<Agencia>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/agencia/{codigoAgencia}")
	public ResponseEntity<Agencia> mostrarPeloCodigoAgencia(@PathVariable int codigoAgencia) {
		Agencia a = servico.recuperarPorCodigoAgencia(codigoAgencia);
		if (a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.notFound().build();
	}

}
