package br.com.fiap.Challengesprint3.dto.ProntuarioDtos;

import br.com.fiap.Challengesprint3.models.Prontuario;

public class ProntuarioDto {
    private String indentificacao;
    private String queixaPrincipal;
    private String hda; //historico da doença atual
    private String historicoMedico;
    private String antecedenteFamiliar;
    private String habitos;

    public ProntuarioDto(Prontuario prontuario) {
        this.indentificacao = prontuario.getIndentificacao();
        this.queixaPrincipal = prontuario.getQueixaPrincipal();
        this.hda = prontuario.getHda();
        this.historicoMedico = prontuario.getHistoricoMedico();
        this.antecedenteFamiliar = prontuario.getAntecedenteFamiliar();
        this.habitos = prontuario.getHabitos();
    }
    
    public ProntuarioDto(String indentificacao, String queixaPrincipal, String hda, String historicoMedico,
            String antecedenteFamiliar, String habitos) {
        this.indentificacao = indentificacao;
        this.queixaPrincipal = queixaPrincipal;
        this.hda = hda;
        this.historicoMedico = historicoMedico;
        this.antecedenteFamiliar = antecedenteFamiliar;
        this.habitos = habitos;
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
