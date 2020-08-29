package it.com.perissinotto.bancoitalia.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_funcionario")
	private int idFuncionario;

	@Column(name = "senha_funcionario", length = 25)
	private String senhaFuncionario;

	@ManyToOne
	@JsonIgnoreProperties("listaFuncionarios")
	private Agencia agenciaFuncionario;

	@Column(name = "cpf_funcionario", length = 11)
	private String cpfFuncionario;

	@Column(name = "nome_funcionario", length = 100)
	private String nomeFuncionario;

	@Column(name = "cargo_funcionario", length = 30)
	private String cargoFuncionario;

	@Column(name = "datanascimento_funcionario")
	private LocalDate dataNascimentoFuncionario;

	@Column(name = "tel_funcionario", length = 25)
	private String telFuncionario;

	@Column(name = "estadocivil_funcionario")
	private char estadoCivilFuncionario;

	@Column(name = "filhos_funcionario")
	private int filhosFuncionario;

	@Column(name = "cep_funcionario")
	private String cepFuncionario;

	@Column(name = "endereco_funcionario", length = 100)
	private String enderecoFuncionario;

	@Column(name = "cidade_funcionario", length = 30)
	private String cidadeFuncionario;

	@Column(name = "estado_funcionario", length = 2)
	private String estadoFuncionario;

	@Column(name = "email_funcionario", length = 100, unique = true)
	private String emailFuncionario;

	@Column(name = "salario_funcionario")
	private double salarioFuncionario;

	@OneToMany(mappedBy = "gerente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("gerente")
	private List<Produto> listaProdutos;

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getSenhaFuncionario() {
		return senhaFuncionario;
	}

	public void setSenhaFuncionario(String senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}

	public Agencia getAgenciaFuncionario() {
		return agenciaFuncionario;
	}

	public void setAgenciaFuncionario(Agencia agenciaFuncionario) {
		this.agenciaFuncionario = agenciaFuncionario;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

	public LocalDate getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}

	public void setDataNascimentoFuncionario(LocalDate dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}

	public String getTelFuncionario() {
		return telFuncionario;
	}

	public void setTelFuncionario(String telFuncionario) {
		this.telFuncionario = telFuncionario;
	}

	public char getEstadoCivilFuncionario() {
		return estadoCivilFuncionario;
	}

	public void setEstadoCivilFuncionario(char estadoCivilFuncionario) {
		this.estadoCivilFuncionario = estadoCivilFuncionario;
	}

	public int getFilhosFuncionario() {
		return filhosFuncionario;
	}

	public void setFilhosFuncionario(int filhosFuncionario) {
		this.filhosFuncionario = filhosFuncionario;
	}

	public String getCepFuncionario() {
		return cepFuncionario;
	}

	public void setCepFuncionario(String cepFuncionario) {
		this.cepFuncionario = cepFuncionario;
	}

	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}

	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}

	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}

	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}

	public String getEstadoFuncionario() {
		return estadoFuncionario;
	}

	public void setEstadoFuncionario(String estadoFuncionario) {
		this.estadoFuncionario = estadoFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
