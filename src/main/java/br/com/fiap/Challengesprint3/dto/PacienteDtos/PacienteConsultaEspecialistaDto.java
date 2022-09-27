package br.com.fiap.Challengesprint3.dto.PacienteDtos;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;
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

    private List<Long> codConsulta;

    private List<Double> valorConfirmado;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta; 

    private String especialistaPj;

    private String especialistaPf;

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
        //consulta
        //this.codConsulta = paciente.getConsulta().iterator();
        //nome especialista
        this.especialistaPf = paciente.getEspecialistaPf().getNomeEspecialista();
        this.especialistaPj = paciente.getEspecialistaPj().getNomeEspecialista();
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

    public String getEspecialistaPj() {
        return especialistaPj;
    }

    public void setEspecialistaPj(String especialistaPj) {
        this.especialistaPj = especialistaPj;
    }

    public String getEspecialistaPf() {
        return especialistaPf;
    }

    public void setEspecialistaPf(String especialistaPf) {
        this.especialistaPf = especialistaPf;
    }

    public Long getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(Long codConsulta) {
        this.codConsulta = codConsulta;
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

    

    
    

}
