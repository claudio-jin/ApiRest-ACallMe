package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;

public class ConsultaProntuarioDto {

    //consulta
    private Double valorConfirmado;

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;

    //prontuario
    private String indentificacao;

    private String queixaPrincipal;

    private String hda; //historico da doença atual

    private String historicoMedico;

    private String antecedenteFamiliar;

    private String habitos;

    public ConsultaProntuarioDto(Consulta consulta){
        this.valorConfirmado = consulta.getValorConfirmado();
        this.dtConsulta = consulta.getDtConsulta();
        //prontuario
        this.indentificacao = consulta.getProntuario().getIndentificacao();
        this.queixaPrincipal = consulta.getProntuario().getQueixaPrincipal();
        this.hda = consulta.getProntuario().getHda();
        this.historicoMedico = consulta.getProntuario().getHistoricoMedico();
        this.antecedenteFamiliar = consulta.getProntuario().getAntecedenteFamiliar();
        this.habitos = consulta.getProntuario().getHabitos();
    }

    public ConsultaProntuarioDto(Double valorConfirmado, Date dtConsulta, String indentificacao, String queixaPrincipal,
            String hda, String historicoMedico, String antecedenteFamiliar, String habitos) {
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
        this.indentificacao = indentificacao;
        this.queixaPrincipal = queixaPrincipal;
        this.hda = hda;
        this.historicoMedico = historicoMedico;
        this.antecedenteFamiliar = antecedenteFamiliar;
        this.habitos = habitos;
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

    public String getIndentificacao() {
        return indentificacao;
    }

    public void setIndentificacao(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getHda() {
        return hda;
    }

    public void setHda(String hda) {
        this.hda = hda;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getAntecedenteFamiliar() {
        return antecedenteFamiliar;
    }

    public void setAntecedenteFamiliar(String antecedenteFamiliar) {
        this.antecedenteFamiliar = antecedenteFamiliar;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }


    
}
