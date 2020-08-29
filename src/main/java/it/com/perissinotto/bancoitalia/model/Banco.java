package it.com.perissinotto.bancoitalia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_bancos")
public class Banco {
	@Id
	@Column(name = "id_banco")
	private int idBanco;

	@Column(name = "nome_banco", length = 100)
	private String nomeBanco;

	@Column(name = "logo_banco", length = 255)
	private String logoBanco;

	@Column(name = "cnpj_banco", length = 14, unique = true)
	private String cnpjBanco;

	@OneToMany(mappedBy = "idBanco", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("idBanco")
	private List<Agencia> listaAgencias;

	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getLogoBanco() {
		return logoBanco;
	}

	public void setLogoBanco(String logoBanco) {
		this.logoBanco = logoBanco;
	}

	public String getCnpjBanco() {
		return cnpjBanco;
	}

	public void setCnpjBanco(String cnpjBanco) {
		this.cnpjBanco = cnpjBanco;
	}

	public List<Agencia> getListaAgencias() {
		return listaAgencias;
	}

	public void setListaAgencias(List<Agencia> listaAgencias) {
		this.listaAgencias = listaAgencias;
	}

}
