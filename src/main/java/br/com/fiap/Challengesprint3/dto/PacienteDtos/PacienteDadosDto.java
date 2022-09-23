package br.com.fiap.Challengesprint3.dto.PacienteDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Paciente;
import lombok.Data;

@Data
public class PacienteDadosDto {
    
    private String nomePaciente;
	
	private String email;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtNascimento;
	
	private int cpf;
	
	private int digitoCpf;
	
	private int telefoneDDD;
	
	private int telefone;
	
	private String estadoCivil;
	
	private String profissao;

    //genero
    private String genero;

    //Endereco
    private int cep;
	
	private String nomeRua;

	private int numeroRua;

	private String complemento;

    private String nomeBairro;
    
    private String nomeCidade;

	private String sigla;

    private String nomeEstado;

	private String siglaEstado;

    public PacienteDadosDto() {

    }

    public PacienteDadosDto(Paciente paciente) {
        this.nomePaciente = paciente.getNomePaciente();
        this.email = paciente.getEmail();
        this.dtNascimento = paciente.getDtNascimento();
        this.cpf = paciente.getCpf();
        this.telefoneDDD = paciente.getTelefoneDDD();
        this.telefone = paciente.getTelefone();
        this.estadoCivil = paciente.getEstadoCivil();
        this.profissao = paciente.getProfissao();
        this.genero = paciente.getGenero().getNomeGenero();
        this.cep = paciente.getEndereco().getCep();
		this.nomeRua = paciente.getEndereco().getNomeRua();
        this.numeroRua = paciente.getEndereco().getNumeroRua();
		this.complemento = paciente.getEndereco().getComplemento();
		this.nomeBairro = paciente.getEndereco().getBairro().getNomeBairro();
		this.nomeCidade = paciente.getEndereco().getBairro().getCidade().getNomeCidade();
		this.sigla = paciente.getEndereco().getBairro().getCidade().getSigla();
		this.nomeEstado = paciente.getEndereco().getBairro().getCidade().getEstado().getNomeEstado();
		this.siglaEstado = paciente.getEndereco().getBairro().getCidade().getEstado().getSiglaEstado();
    }


}
