package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class EspecialistaPj extends Especialista {

	private Integer cnpj;

	private Integer cnpjDigito;

	private String razaoSocial;

	public EspecialistaPj() {

	}

	public EspecialistaPj(Long codEspecialista, String nomeEspecialista, String email, String senha, Date dtNascimento,
			Integer telefoneDDD, Integer telefone, String descricaoSobre, String tipoEspecialidade,
			EspecialistaTipo tipo, Genero genero, Endereco endereco, Integer cnpj, Integer cnpjDigito,
			String razaoSocial) {
		super(codEspecialista, nomeEspecialista, email, senha, dtNascimento, telefoneDDD, telefone, descricaoSobre,
				tipoEspecialidade, tipo, genero, endereco);
		this.cnpj = cnpj;
		this.cnpjDigito = cnpjDigito;
		this.razaoSocial = razaoSocial;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getCnpjDigito() {
		return cnpjDigito;
	}

	public void setCnpjDigito(Integer cnpjDigito) {
		this.cnpjDigito = cnpjDigito;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
