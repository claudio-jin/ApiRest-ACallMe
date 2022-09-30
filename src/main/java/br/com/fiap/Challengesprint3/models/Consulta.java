package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codConsulta;
    private Double valorConfirmado;

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EspecialistaPf espePf;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EspecialistaPj espePj;

    //implementar relacao prontuario
    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Prontuario prontuario;

    // @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
    // private Paciente paciente;

    public Consulta() {
        
    }
    
    public Consulta(Long codConsulta, Double valorConfirmado, Date dtConsulta, EspecialistaPf espePf,
            EspecialistaPj espePj) {
        this.codConsulta = codConsulta;
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
        this.espePf = espePf;
        this.espePj = espePj;
    }

    public Consulta(Long codConsulta, Double valorConfirmado, Date dtConsulta, EspecialistaPf espePf,
            EspecialistaPj espePj, Prontuario prontuario) {
        this.codConsulta = codConsulta;
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
        this.espePf = espePf;
        this.espePj = espePj;
        this.prontuario = prontuario;
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

    public EspecialistaPf getEspePf() {
        return espePf;
    }

    public void setEspePf(EspecialistaPf espePf) {
        this.espePf = espePf;
    }

    public EspecialistaPj getEspePj() {
        return espePj;
    }

    public void setEspePj(EspecialistaPj espePj) {
        this.espePj = espePj;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    

}
