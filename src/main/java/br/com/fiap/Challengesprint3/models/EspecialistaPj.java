package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class EspecialistaPj extends Especialista{
	
	private int cnpj;
	
	private int cnpjDigito;
	
	private String razaoSocial;
	
	public EspecialistaPj() {
		
	}

	public EspecialistaPj(Long codEspecialista, String nomeEspecialista, String email, String senha, Date dtNascimento,
			int telefoneDDD, int telefone, String descricaoSobre, double valorConsulta, String tipoEspecialidade,
			EspecialistaTipo tipo, Genero genero, int cnpj, int cnpjDigito, String razaoSocial) {
		super(codEspecialista, nomeEspecialista, email, senha, dtNascimento, telefoneDDD, telefone, descricaoSobre,
				valorConsulta, tipoEspecialidade, tipo, genero);
		this.cnpj = cnpj;
		this.cnpjDigito = cnpjDigito;
		this.razaoSocial = razaoSocial;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpjDigito() {
		return cnpjDigito;
	}

	public void setCnpjDigito(int cnpjDigito) {
		this.cnpjDigito = cnpjDigito;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	

}
