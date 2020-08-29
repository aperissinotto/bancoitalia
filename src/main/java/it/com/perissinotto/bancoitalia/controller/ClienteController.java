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

import it.com.perissinotto.bancoitalia.model.Cliente;
import it.com.perissinotto.bancoitalia.services.IClienteService;

@RestController
@CrossOrigin("*")
public class ClienteController {
	@Autowired
	private IClienteService servico;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/cliente/{idCliente}")
	public ResponseEntity<Cliente> mostrarPeloIdCliente(@PathVariable int idCliente) {
		Cliente c = servico.recuperarPorIdCliente(idCliente);
		if (c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> inserirNovoCliente(@RequestBody Cliente novo) {
		try {
			servico.adcionarNovoCliente(novo);
			return ResponseEntity.status(201).body(novo);
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
