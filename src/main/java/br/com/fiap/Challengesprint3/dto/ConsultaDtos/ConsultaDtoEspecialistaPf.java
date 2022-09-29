package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ConsultaDtoEspecialistaPf {

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;
	
	private String nomeEspecialista;
	
	private String email;
	
    @JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNascimento;
	
	private Integer telefoneDDD;
	
	private Integer telefone;

    //genero
    private String genero;

}
