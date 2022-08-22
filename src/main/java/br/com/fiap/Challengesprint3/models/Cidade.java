package br.com.fiap.Challengesprint3.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCidade;

	@NotBlank(message = "Nome da cidade é obrigatório")
	@Max(50)
	private String nomeCidade;

	@Max(3)
	private char sigla;
	
	@ManyToOne
	private Estado estado;

	@OneToMany
	private List<Bairro> bairros;

	public Cidade(int codCidade, String nomeCidade, char sigla) {
		super();
		this.codCidade = codCidade;
		this.nomeCidade = nomeCidade;
		this.sigla = sigla;
	}

	public int getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(int codCidade) {
		this.codCidade = codCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public char getSigla() {
		return sigla;
	}

	public void setSigla(char sigla) {
		this.sigla = sigla;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", sigla=" + sigla + ", estado="
				+ estado.getCodEstado() + "]";
	}
	
	
}
