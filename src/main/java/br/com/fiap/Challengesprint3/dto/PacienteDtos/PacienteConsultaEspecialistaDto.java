package br.com.fiap.Challengesprint3.dto.PacienteDtos;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDto;
import br.com.fiap.Challengesprint3.models.Paciente;

public class PacienteConsultaEspecialistaDto {
    
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

    //consulta
    private List<ConsultaDto> consultaDto;
    
    public PacienteConsultaEspecialistaDto(Paciente paciente) {
        this.nomePaciente = paciente.getNomePaciente();
        this.email = paciente.getEmail();
        this.dtNascimento = paciente.getDtNascimento();
        this.cpf = paciente.getCpf();
        this.telefoneDDD = paciente.getTelefoneDDD();
        this.telefone = paciente.getTelefone();
        this.estadoCivil = paciente.getEstadoCivil();
        this.profissao = paciente.getProfissao();
        this.genero = paciente.getGenero().getNomeGenero();
        this.consultaDto = paciente.getConsulta().stream().map(c -> new ConsultaDto(c)).collect(Collectors.toList());
        
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDigitoCpf() {
        return digitoCpf;
    }

    public void setDigitoCpf(int digitoCpf) {
        this.digitoCpf = digitoCpf;
    }

    public int getTelefoneDDD() {
        return telefoneDDD;
    }

    public void setTelefoneDDD(int telefoneDDD) {
        this.telefoneDDD = telefoneDDD;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<ConsultaDto> getConsultaDto() {
        return consultaDto;
    }

    public void setConsultaDto(List<ConsultaDto> consultaDto) {
        this.consultaDto = consultaDto;
    }
}
