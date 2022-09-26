package br.com.fiap.Challengesprint3.dto.PacienteDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Paciente;

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
		this.sigla = paciente.getEndereco().getBairro().getCidade().getSiglaCidade();
		this.nomeEstado = paciente.getEndereco().getBairro().getCidade().getEstado().getNomeEstado();
		this.siglaEstado = paciente.getEndereco().getBairro().getCidade().getEstado().getSiglaEstado();
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    

}
