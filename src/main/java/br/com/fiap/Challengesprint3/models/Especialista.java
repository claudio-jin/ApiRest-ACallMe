//package br.com.fiap.Challengesprint3.models;
//
//import java.util.Date;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.ManyToOne;
//
//import org.springframework.data.annotation.Id;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//@Entity
//public class Especialista {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long codEspecialista;
//	
//	private String nomeEspecialista;
//	
//	private String email;
//	
//	private String senha;
//	
//	@JsonFormat(pattern="dd/MM/yyyy")
//	private Date dtNascimento;
//	
//	private int telefoneDDD;
//	
//	private int telefone;
//	
//	private String descricaoSobre;
//	
//	private double valorConsulta;
//	
//	private String tipoEspecialidade;
//	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Genero genero;
//
//	//	private Endereco endereco;
//
//	public Especialista(Long codEspecialista, String nomeEspecialista, String email, String senha, Date dtNascimento,
//			int telefoneDDD, int telefone, String descricaoSobre, double valorConsulta, String tipoEspecialidade,
//			Genero genero) {
//		super();
//		this.codEspecialista = codEspecialista;
//		this.nomeEspecialista = nomeEspecialista;
//		this.email = email;
//		this.senha = senha;
//		this.dtNascimento = dtNascimento;
//		this.telefoneDDD = telefoneDDD;
//		this.telefone = telefone;
//		this.descricaoSobre = descricaoSobre;
//		this.valorConsulta = valorConsulta;
//		this.tipoEspecialidade = tipoEspecialidade;
//		this.genero = genero;
//	}
//
//	public Long getCodEspecialista() {
//		return codEspecialista;
//	}
//
//	public void setCodEspecialista(Long codEspecialista) {
//		this.codEspecialista = codEspecialista;
//	}
//
//	public String getNomeEspecialista() {
//		return nomeEspecialista;
//	}
//
//	public void setNomeEspecialista(String nomeEspecialista) {
//		this.nomeEspecialista = nomeEspecialista;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//
//	public Date getDtNascimento() {
//		return dtNascimento;
//	}
//
//	public void setDtNascimento(Date dtNascimento) {
//		this.dtNascimento = dtNascimento;
//	}
//
//	public int getTelefoneDDD() {
//		return telefoneDDD;
//	}
//
//	public void setTelefoneDDD(int telefoneDDD) {
//		this.telefoneDDD = telefoneDDD;
//	}
//
//	public int getTelefone() {
//		return telefone;
//	}
//
//	public void setTelefone(int telefone) {
//		this.telefone = telefone;
//	}
//
//	public String getDescricaoSobre() {
//		return descricaoSobre;
//	}
//
//	public void setDescricaoSobre(String descricaoSobre) {
//		this.descricaoSobre = descricaoSobre;
//	}
//
//	public double getValorConsulta() {
//		return valorConsulta;
//	}
//
//	public void setValorConsulta(double valorConsulta) {
//		this.valorConsulta = valorConsulta;
//	}
//
//	public String getTipoEspecialidade() {
//		return tipoEspecialidade;
//	}
//
//	public void setTipoEspecialidade(String tipoEspecialidade) {
//		this.tipoEspecialidade = tipoEspecialidade;
//	}
//
//	public Genero getGenero() {
//		return genero;
//	}
//
//	public void setGenero(Genero genero) {
//		this.genero = genero;
//	}
//
//	@Override
//	public String toString() {
//		return "Especialista [codEspecialista=" + codEspecialista + ", nomeEspecialista=" + nomeEspecialista
//				+ ", email=" + email + ", senha=" + senha + ", dtNascimento=" + dtNascimento + ", telefoneDDD="
//				+ telefoneDDD + ", telefone=" + telefone + ", descricaoSobre=" + descricaoSobre + ", valorConsulta="
//				+ valorConsulta + ", tipoEspecialidade=" + tipoEspecialidade + ", genero=" + genero + "]";
//	}
//
//
//	
//}
