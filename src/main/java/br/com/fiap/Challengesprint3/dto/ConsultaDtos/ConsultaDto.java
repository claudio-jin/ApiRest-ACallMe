package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;

public class ConsultaDto {

    private Double valorConfirmado;

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;

    public ConsultaDto() {
    }

    public ConsultaDto(Consulta consulta) {
        this.valorConfirmado = consulta.getValorConfirmado();
        this.dtConsulta = consulta.getDtConsulta();
    }


    public ConsultaDto(Double valorConfirmado, Date dtConsulta) {
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
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
