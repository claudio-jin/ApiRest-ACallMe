package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.Entity;

import br.com.fiap.Challengesprint3.enums.EspecialistaTipo;

@Entity
public class EspecialistaPf extends Especialista {

	private Integer cpf;

	private Integer digitoCpf;

	public EspecialistaPf() {

	}

	public EspecialistaPf(Long id, String email, String password, String nomeEspecialista,
			Date dtNascimento, Integer telefoneDDD, Integer telefone, String descricaoSobre, String tipoEspecialidade,
			EspecialistaTipo tipo, Genero genero, Endereco endereco, Integer cpf, Integer digitoCpf) {
		super(id, email, password, nomeEspecialista, dtNascimento, telefoneDDD, telefone,
				descricaoSobre, tipoEspecialidade, tipo, genero, endereco);
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
