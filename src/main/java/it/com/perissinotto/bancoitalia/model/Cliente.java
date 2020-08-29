package it.com.perissinotto.bancoitalia.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int idCliente;

	@Column(name = "senha_cliente", length = 25)
	private String senhaCliente;

	@Column(name = "cpf_cliente", length = 11)
	private String cpfCliente;

	@Column(name = "nome_cliente", length = 100)
	private String nomeCliente;

	@Column(name = "datanascimento_cliente")
	private LocalDate dataNascimentoCliente;

	@Column(name = "tel_cliente", length = 25)
	private String telCliente;

	@Column(name = "estadocivil_cliente")
	private char estadoCivilCliente;

	@Column(name = "filhos_cliente")
	private int filhosCliente;

	@Column(name = "cep_cliente")
	private String cepCliente;

	@Column(name = "endereco_cliente", length = 100)
	private String enderecoCliente;

	@Column(name = "cidade_cliente", length = 30)
	private String cidadeCliente;

	@Column(name = "estado_cliente", length = 2)
	private String estadoCliente;

	@Column(name = "email_cliente", length = 100, unique = true)
	private String emailCliente;

	@Column(name = "patrimonio_cliente")
	private double patrimonioCliente;

	@Column(name = "rendimentos_cliente")
	private double rendimentosCliente;

	@ManyToMany(mappedBy = "listaClientes", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("listaClientes")
	private List<Agencia> listaAgencias;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
	private List<Produto> listaProdutos;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public LocalDate getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}

	public void setDataNascimentoCliente(LocalDate dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	public char getEstadoCivilCliente() {
		return estadoCivilCliente;
	}

	public void setEstadoCivilCliente(char estadoCivilCliente) {
		this.estadoCivilCliente = estadoCivilCliente;
	}

	public int getFilhosCliente() {
		return filhosCliente;
	}

	public void setFilhosCliente(int filhosCliente) {
		this.filhosCliente = filhosCliente;
	}

	public String getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public double getPatrimonioCliente() {
		return patrimonioCliente;
	}

	public void setPatrimonioCliente(double patrimonioCliente) {
		this.patrimonioCliente = patrimonioCliente;
	}

	public double getRendimentosCliente() {
		return rendimentosCliente;
	}

	public void setRendimentosCliente(double rendimentosCliente) {
		this.rendimentosCliente = rendimentosCliente;
	}

	public List<Agencia> getListaAgencias() {
		return listaAgencias;
	}

	public void setListaAgencias(List<Agencia> listaAgencias) {
		this.listaAgencias = listaAgencias;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
