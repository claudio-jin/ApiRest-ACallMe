package br.com.fiap.Challengesprint3.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codConsulta;
    private double valorConfirmado;
    private Date dtConsulta;

    //Relacoes a confirmar
    // private EspecialistaPf espePf;

    // private EspecialistaPj espePj;

    @OneToOne( cascade = CascadeType.ALL)
    private Paciente paciente;


}
