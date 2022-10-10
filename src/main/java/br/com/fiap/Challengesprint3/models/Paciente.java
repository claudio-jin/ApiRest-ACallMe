package br.com.fiap.Challengesprint3.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Paciente extends Usuario {
	
	private String nomePaciente;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNascimento;
	
	private Integer cpf;
	
	private Integer digitoCpf;
	
	private Integer telefoneDDD;
	
	private Integer telefone;
	
	private String estadoCivil;
	
	private String profissao;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Genero genero;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	//Relação para puxar consultas
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Consulta> consulta;
	
	public Paciente () {
		
	}

	public Paciente(Long id, String email, String password, Long id2, String nomePaciente, Date dtNascimento,
			Integer cpf, Integer digitoCpf, Integer telefoneDDD, Integer telefone, String estadoCivil, String profissao,
			Genero genero, Endereco endereco, List<Consulta> consulta) {
		super(id, email, password);
		this.nomePaciente = nomePaciente;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.digitoCpf = digitoCpf;
		this.telefoneDDD = telefoneDDD;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.genero = genero;
		this.endereco = endereco;
		this.consulta = consulta;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getDigitoCpf() {
		return digitoCpf;
	}

	public void setDigitoCpf(Integer digitoCpf) {
		this.digitoCpf = digitoCpf;
	}

	public Integer getTelefoneDDD() {
		return telefoneDDD;
	}

	public void setTelefoneDDD(Integer telefoneDDD) {
		this.telefoneDDD = telefoneDDD;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}
}
