package it.com.perissinotto.bancoitalia.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_agencias")
public class Agencia {
	@Id
	@Column(name="codigo_agencia")
	private int codigoAgencia;

	@ManyToOne
	@JsonIgnoreProperties("listaAgencias") 
	private Banco codBanco;

	@Column(name="nome_agencia", length=100)
	private String nomeAgencia;
	
	@Column(name="tel_agencia", length=25)
	private String telAgencia;

	@Column(name="cep_agencia")
	private String cepAgencia;
	
	@Column(name="end_agencia", length=100)
	private String endAgencia;

	@Column(name="cidade_agencia", length=30)
	private String cidadeAgencia;

	@Column(name="estado_agencia", length=2)
	private String estadoAgencia;
	
	@Column(name="email_agencia", length=100, unique=true)
	private String emailAgencia;
	
	@Column(name="cnpj_agencia", length=14, unique=true)
	private String cnpjAgencia;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="agenciaFuncionario")
	@JsonIgnoreProperties("agenciaFuncionario")
	private List<Funcionario> listaFuncionarios;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="agenciaCliente")
	@JsonIgnoreProperties("agenciaCliente")
	private List<Cliente> listaClientes;

	public int getCodigoAgencia() {
		return codigoAgencia;
	}

	public void setCodigoAgencia(int codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}

	public Banco getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(Banco codBanco) {
		this.codBanco = codBanco;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getTelAgencia() {
		return telAgencia;
	}

	public void setTelAgencia(String telAgencia) {
		this.telAgencia = telAgencia;
	}

	public String getCepAgencia() {
		return cepAgencia;
	}

	public void setCepAgencia(String cepAgencia) {
		this.cepAgencia = cepAgencia;
	}

	public String getEndAgencia() {
		return endAgencia;
	}

	public void setEndAgencia(String endAgencia) {
		this.endAgencia = endAgencia;
	}

	public String getCidadeAgencia() {
		return cidadeAgencia;
	}

	public void setCidadeAgencia(String cidadeAgencia) {
		this.cidadeAgencia = cidadeAgencia;
	}

	public String getEstadoAgencia() {
		return estadoAgencia;
	}

	public void setEstadoAgencia(String estadoAgencia) {
		this.estadoAgencia = estadoAgencia;
	}

	public String getEmailAgencia() {
		return emailAgencia;
	}

	public void setEmailAgencia(String emailAgencia) {
		this.emailAgencia = emailAgencia;
	}

	public String getCnpjAgencia() {
		return cnpjAgencia;
	}

	public void setCnpjAgencia(String cnpjAgencia) {
		this.cnpjAgencia = cnpjAgencia;
	}

	public List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
