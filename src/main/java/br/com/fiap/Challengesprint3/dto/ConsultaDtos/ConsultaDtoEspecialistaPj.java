package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;

public class ConsultaDtoEspecialistaPj {
    // Consulta
	private Double valorConfirmado;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dtConsulta;

	// Alguns atributos de especialistaPf
	private String nomeEspecialista;

	private String email;

	private Integer telefoneDDD;

	private Integer telefone;

	// genero
	private String genero;

    //EspecialistaPj
    private Integer cnpj;

    private Integer cnpjDigito;

    public  ConsultaDtoEspecialistaPj(Consulta consulta) {
        this.valorConfirmado = consulta.getValorConfirmado();
		this.dtConsulta = consulta.getDtConsulta();
		// EspecialistaPf
		this.nomeEspecialista = consulta.getEspePj().getNomeEspecialista();
		this.email = consulta.getEspePj().getEmail();
		this.telefoneDDD = consulta.getEspePj().getTelefoneDDD();
		this.telefone = consulta.getEspePj().getTelefone();
		this.genero = consulta.getEspePj().getGenero().getNomeGenero();
        this.cnpj = consulta.getEspePj().getCnpj();
        this.cnpjDigito = consulta.getEspePj().getCnpjDigito();
    }    

    public ConsultaDtoEspecialistaPj(Double valorConfirmado, Date dtConsulta, String nomeEspecialista, String email,
            Integer telefoneDDD, Integer telefone, String genero, Integer cnpj, Integer cnpjDigito) {
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
        this.nomeEspecialista = nomeEspecialista;
        this.email = email;
        this.telefoneDDD = telefoneDDD;
        this.telefone = telefone;
        this.genero = genero;
        this.cnpj = cnpj;
        this.cnpjDigito = cnpjDigito;
    }

    public Double getValorConfirmado() {
        return valorConfirmado;
    }

    public void setValorConfirmado(Double valorConfirmado) {
        this.valorConfirmado = valorConfirmado;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public String getNomeEspecialista() {
        return nomeEspecialista;
    }

    public void setNomeEspecialista(String nomeEspecialista) {
        this.nomeEspecialista = nomeEspecialista;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefoneDDD() {
        return telefoneDDD;
    }

    public void setTelefoneDDD(Integer telefoneDDD) {
        this.telefoneDDD = telefoneDDD;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    

}
