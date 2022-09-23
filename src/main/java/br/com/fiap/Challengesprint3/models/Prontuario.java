package br.com.fiap.Challengesprint3.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codProntuario;
    private String indentificacao;
    private String queixaPrincipal;
    private String hda; //historico da doença atual
    private String historicoMedico;
    private String antecedenteFamiliar;
    private String habitos;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Consulta codConsulta;


    public Prontuario() {

    }

    public Prontuario(Long codProntuario, String indentificacao, String queixaPrincipal, String hda,
            String historicoMedico, String antecedenteFamiliar, String habitos, Consulta codConsulta) {
        this.codProntuario = codProntuario;
        this.indentificacao = indentificacao;
        this.queixaPrincipal = queixaPrincipal;
        this.hda = hda;
        this.historicoMedico = historicoMedico;
        this.antecedenteFamiliar = antecedenteFamiliar;
        this.habitos = habitos;
        this.codConsulta = codConsulta;
    }

    public Long getCodProntuario() {
        return codProntuario;
    }

    public void setCodProntuario(Long codProntuario) {
        this.codProntuario = codProntuario;
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

    public Consulta getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(Consulta codConsulta) {
        this.codConsulta = codConsulta;
    }

    @Override
    public String toString() {
        return "Prontuario [antecedenteFamiliar=" + antecedenteFamiliar + ", codConsulta=" + codConsulta
                + ", codProntuario=" + codProntuario + ", habitos=" + habitos + ", hda=" + hda + ", historicoMedico="
                + historicoMedico + ", indentificacao=" + indentificacao + ", queixaPrincipal=" + queixaPrincipal + "]";
    }

    
    


}
