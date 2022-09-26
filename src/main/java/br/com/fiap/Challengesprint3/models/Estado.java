package br.com.fiap.Challengesprint3.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLG_ESTADO")
public class Estado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codEstado;

	private String nomeEstado;

	private String siglaEstado;

	@OneToMany
	private List<Cidade> cidades;

	public Estado () {}
	
	public Estado(int codEstado, String nomeEstado, String siglaEstado) {
		super();
		this.codEstado = codEstado;
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
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
	public String getSiglaEstado() {
		return siglaEstado;
	}
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	@Override
	public String toString() {
		return "Estado [estado=" + codEstado + ", nomeEstado=" + nomeEstado + ", sigla=" + siglaEstado + "]";
	}
	
}
