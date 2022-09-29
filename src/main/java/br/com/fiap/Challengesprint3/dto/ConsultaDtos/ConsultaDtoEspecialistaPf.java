package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.EspecialistaTipo;

public class ConsultaDtoEspecialistaPf {
    
	

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;

    private Long codEspecialista;
	
	private String nomeEspecialista;
	
	private String email;
	
    @JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNascimento;
	
	private Integer telefoneDDD;
	
	private Integer telefone;
	
	private String descricaoSobre;
	
	private EspecialistaTipo tipoEspecialidade;

    //especialistaPf
    private Integer cpf;
	
	private Integer digitoCpf;

	//private Double valorConsulta; //verificar qual valor buscar para ser mapeado
    
    //genero
    private String genero;

}
