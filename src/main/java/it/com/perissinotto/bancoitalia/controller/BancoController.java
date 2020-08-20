package it.com.perissinotto.bancoitalia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.com.perissinotto.bancoitalia.model.Banco;
import it.com.perissinotto.bancoitalia.services.IBancoService;

@RestController
@CrossOrigin("*")
public class BancoController {
	@Autowired
	private IBancoService servico;

	@GetMapping("/bancos")
	public ResponseEntity<List<Banco>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/banco/{codigoBanco}")
	public ResponseEntity<Banco> mostrarPeloCodigoBanco(@PathVariable int codigoBanco) {
		Banco b = servico.recuperarPorCodigoBanco(codigoBanco);
		if (b != null) {
			return ResponseEntity.ok(b);
		}
		return ResponseEntity.notFound().build();
	}
}
