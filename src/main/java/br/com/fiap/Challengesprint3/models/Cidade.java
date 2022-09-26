package br.com.fiap.Challengesprint3.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLG_CIDADE")
public class Cidade implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCidade;

	private String nomeCidade;

	private String siglaCidade;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Estado estado;

    public Cidade() {}

	public Cidade(int codCidade, String nomeCidade, String siglaCidade) {
		super();
		this.codCidade = codCidade;
		this.nomeCidade = nomeCidade;
		this.siglaCidade = siglaCidade;
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

	public String getSiglaCidade() {
		return siglaCidade;
	}

	public void setSiglaCidade(String siglaCidade) {
		this.siglaCidade = siglaCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [codCidade=" + codCidade + ", estado=" + estado + ", nomeCidade=" + nomeCidade + ", siglaCidade="
				+ siglaCidade + "]";
	}



	
	

}
