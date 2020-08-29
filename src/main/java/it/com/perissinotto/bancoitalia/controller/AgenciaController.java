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

import it.com.perissinotto.bancoitalia.model.Agencia;
import it.com.perissinotto.bancoitalia.services.IAgenciaService;

@RestController
@CrossOrigin("*")
public class AgenciaController {
	@Autowired
	private IAgenciaService servico;

	@GetMapping("/agencias")
	public ResponseEntity<List<Agencia>> mostrarTodas() {
		return ResponseEntity.ok(servico.recuperarTodas());
	}

	@GetMapping("/agencia/{idAgencia}")
	public ResponseEntity<Agencia> mostrarPeloIdAgencia(@PathVariable int idAgencia) {
		Agencia a = servico.recuperarPorIdAgencia(idAgencia);
		if (a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/agencia/nova")
	public ResponseEntity<Agencia> inserirNovaAgencia(@RequestBody Agencia nova) {
		try {
			servico.adcionarNovaAgencia(nova);
			return ResponseEntity.status(201).body(nova);
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
