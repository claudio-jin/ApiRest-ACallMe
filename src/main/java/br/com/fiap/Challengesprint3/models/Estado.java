package br.com.fiap.Challengesprint3.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codEstado;

	@Size(min = 5, max = 50)
	private String nomeEstado;

	@Max(2)
	private char sigla;

	@OneToMany
	private List<Cidade> cidades;
	
	public Estado(int codEstado, String nomeEstado, char sigla) {
		super();
		this.codEstado = codEstado;
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}
	public int getCodEstado() {
		return codEstado;
	}
	public void setEstado(int codEstado) {
		this.codEstado = codEstado;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public char getSigla() {
		return sigla;
	}
	public void setSigla(char sigla) {
		this.sigla = sigla;
	}
	@Override
	public String toString() {
		return "Estado [estado=" + codEstado + ", nomeEstado=" + nomeEstado + ", sigla=" + sigla + "]";
	}
	
}
