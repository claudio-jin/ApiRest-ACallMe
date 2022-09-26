package br.com.fiap.Challengesprint3.dto.EspecialistaPfDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EspecialistaPfDto {
    private Long codEspecialista;
	
	private String nomeEspecialista;
	
	private String email;
	
    @JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNascimento;
	
	private Integer telefoneDDD;
	
	private Integer telefone;
	
	private String descricaoSobre;
	
	private String tipoEspecialidade;

    //especialistaPf
    private Integer cpf;
	
	private Integer digitoCpf;

	//private Double valorConsulta; //verificar qual valor buscar para ser mapeado
    
    //tipo do especialista
    private String tipo;
    
    //genero
    private String genero;

    //endereco
    private int cep;
	
	private String nomeRua;

	private int numeroRua;

	private String complemento;

	//bairro
    private String nomeBairro;
    
	//cidade
    private String nomeCidade;

	private String sigla;

	//estado
    private String nomeEstado;

	private String siglaEstado;

}
