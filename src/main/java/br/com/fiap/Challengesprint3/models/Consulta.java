package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Consulta {

    private int codConsulta;
    private double valorConfirmado;
    private Date dtConsulta;
}
