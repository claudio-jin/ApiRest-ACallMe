package br.com.fiap.Challengesprint3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cep;

	@NotBlank(message = "Nome da rua não pode estar vazio")
	@Max(100)
	private String nomeRua;

	@NotBlank(message = "Número da rua não pode estar vazio")
	@Max(5)
	private int numeroRua;

	@Max(50)
	private String complemento;

	//Relacao de muitos para um de endereco para Bairro
	// @ManyToOne
	// private Bairro bairro;

	public Endereco(int cep, String nomeRua, int numeroRua, String complemento) {
		super();
		this.cep = cep;
		this.nomeRua = nomeRua;
		this.numeroRua = numeroRua;
		this.complemento = complemento;
		//this.bairro = bairro;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getNomeRua() {
		return nomeRua;
	}
	
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	public int getNumeroRua() {
		return numeroRua;
	}
	
	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	// public Bairro getBairro() {
	// 	return bairro;
	// }

	// public void setBairro(Bairro bairro) {
	// 	this.bairro = bairro;
	// }
	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", nomeRua=" + nomeRua + ", numeroRua=" + numeroRua + ", complemento="
				+ complemento + "]";
	}
	//+ ", bairro=" + bairro.getCodBairro() + "
	
	
}
