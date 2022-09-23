package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class EspecialistaPf extends Especialista{

	private Integer cpf;
	
	private Integer digitoCpf;
	
	public EspecialistaPf() {
		
	}

	public EspecialistaPf(Long codEspecialista, String nomeEspecialista, String email, String senha, Date dtNascimento,
			Integer telefoneDDD, Integer telefone, String descricaoSobre, Double valorConsulta, String tipoEspecialidade,
			EspecialistaTipo tipo, Genero genero, Integer cpf, Integer digitoCpf) {
		super(codEspecialista, nomeEspecialista, email, senha, dtNascimento, telefoneDDD, telefone, descricaoSobre,
				valorConsulta, tipoEspecialidade, tipo, genero);
		this.cpf = cpf;
		this.digitoCpf = digitoCpf;
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
