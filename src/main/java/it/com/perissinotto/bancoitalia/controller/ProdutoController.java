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

import it.com.perissinotto.bancoitalia.model.Produto;
import it.com.perissinotto.bancoitalia.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	private IProdutoService servico;

	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/produto/{idProduto}")
	public ResponseEntity<Produto> mostrarPeloIdProduto(@PathVariable int idProduto) {
		Produto p = servico.recuperarPorIdProduto(idProduto);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/produto/novo")
	public ResponseEntity<Produto> inserirNovoProduto(@RequestBody Produto novo) {
		try {
			servico.adcionarNovoProduto(novo);
			return ResponseEntity.status(201).body(novo);
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
