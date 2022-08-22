package br.com.fiap.Challengesprint3.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name="T_CLG_BAIRRO")
public class Bairro {

	@Id
	@Column(name = "cd_bairro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codBairro;

	@Column(name = "nm_bairro")
	@Max(50)
	private String nomeBairro;
	
	//Relacao muitos para um de bairro para cidade
	@ManyToOne
	private Cidade cidade;

	//Relacao de um para muitos de bairro para endereco
	@OneToMany
	private List<Endereco> enderecos;

	public Bairro(int codBairro, String nomeBairro, Cidade cidade) {
		super();
		this.codBairro = codBairro;
		this.nomeBairro = nomeBairro;
		this.cidade = cidade;
	}

	public int getCodBairro() {
		return codBairro;
	}

	public void setCodBairro(int codBairro) {
		this.codBairro = codBairro;
	}
	
	public String getNomeBairro() {
		return nomeBairro;
	}
	
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Bairro [codBairro=" + codBairro + ", nomeBairro=" + nomeBairro + ", cidade=" + cidade.getCodCidade() + "]";
	}
	
	
}
