package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomePaciente;
	
	private String email;
	
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

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private EspecialistaPf especialistaPf;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private EspecialistaPj especialistaPj;
	
	public Paciente () {
		
	}

	public Paciente(Long id, String nomePaciente, String email, Date dtNascimento, Integer cpf, Integer digitoCpf,
			Integer telefoneDDD, Integer telefone, String estadoCivil, String profissao, Genero genero, Endereco endereco) {
		super();
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.digitoCpf = digitoCpf;
		this.telefoneDDD = telefoneDDD;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.genero = genero;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		
	public EspecialistaPf getEspecialistaPf() {
		return especialistaPf;
	}

	public void setEspecialistaPf(EspecialistaPf especialistaPf) {
		this.especialistaPf = especialistaPf;
	}
	
	public EspecialistaPj getEspecialistaPj() {
		return especialistaPj;
	}
	
	public void setEspecialistaPj(EspecialistaPj especialistaPj) {
		this.especialistaPj = especialistaPj;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nomePaciente=" + nomePaciente + ", email=" + email + ", dtNascimento="
				+ dtNascimento + ", cpf=" + cpf + ", digitoCpf=" + digitoCpf + ", telefoneDDD=" + telefoneDDD
				+ ", telefone=" + telefone + ", estadoCivil=" + estadoCivil + ", profissao=" + profissao + ", genero="
				+ genero + "]";
	}
}
