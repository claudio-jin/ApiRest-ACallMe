package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
public class EspecialistaPf extends Especialista{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long codEspecialistaPf;
	
	private int cpf;
	
	private int digitoCpf;
	
	public EspecialistaPf() {
		
	}

	public EspecialistaPf(Long codEspecialista, String nomeEspecialista, String email, String senha, Date dtNascimento,
			int telefoneDDD, int telefone, String descricaoSobre, double valorConsulta, String tipoEspecialidade,
			EspecialistaTipo tipo, Genero genero, int cpf, int digitoCpf) {
		super(codEspecialista, nomeEspecialista, email, senha, dtNascimento, telefoneDDD, telefone, descricaoSobre,
				valorConsulta, tipoEspecialidade, tipo, genero);
		this.cpf = cpf;
		this.digitoCpf = digitoCpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getDigitoCpf() {
		return digitoCpf;
	}

	public void setDigitoCpf(int digitoCpf) {
		this.digitoCpf = digitoCpf;
	}

}
