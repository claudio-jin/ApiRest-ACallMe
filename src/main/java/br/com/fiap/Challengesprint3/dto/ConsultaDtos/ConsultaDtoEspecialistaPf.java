package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;

public class ConsultaDtoEspecialistaPf {

	// Consulta
	private Double valorConfirmado;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dtConsulta;

	// Alguns atributos de especialistaPf
	private String nomeEspecialista;

	private String email;

	private Integer telefoneDDD;

	private Integer telefone;

	// genero
	private String genero;

	// indicativo especialistapf
	private Integer cpf;

	private Integer digitoCpf;

	public ConsultaDtoEspecialistaPf(Consulta consulta) {
		this.valorConfirmado = consulta.getValorConfirmado();
		this.dtConsulta = consulta.getDtConsulta();
		// EspecialistaPf
		this.nomeEspecialista = consulta.getEspePf().getNomeEspecialista();
		this.email = consulta.getEspePf().getEmail();
		this.telefoneDDD = consulta.getEspePf().getTelefoneDDD();
		this.telefone = consulta.getEspePf().getTelefone();
		this.genero = consulta.getEspePf().getGenero().getNomeGenero();
		this.cpf = consulta.getEspePf().getCpf();
		this.digitoCpf = consulta.getEspePf().getDigitoCpf();
	}

	public ConsultaDtoEspecialistaPf(Double valorConfirmado, Date dtConsulta, String nomeEspecialista, String email,
			Integer telefoneDDD, Integer telefone, String genero, Integer cpf, Integer digitoCpf) {
		this.valorConfirmado = valorConfirmado;
		this.dtConsulta = dtConsulta;
		this.nomeEspecialista = nomeEspecialista;
		this.email = email;
		this.telefoneDDD = telefoneDDD;
		this.telefone = telefone;
		this.genero = genero;
		this.cpf = cpf;
		this.digitoCpf = digitoCpf;
	}

	public Double getValorConfirmado() {
		return valorConfirmado;
	}

	public void setValorConfirmado(Double valorConfirmado) {
		this.valorConfirmado = valorConfirmado;
	}

	public Date getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public String getNomeEspecialista() {
		return nomeEspecialista;
	}

	public void setNomeEspecialista(String nomeEspecialista) {
		this.nomeEspecialista = nomeEspecialista;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

}
