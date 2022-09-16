package br.com.fiap.Challengesprint3.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codProntuario;
    private String indentificacao;
    private String queixaPrincipal;
    private String hda;
    private String historicoMedico;
    private String antecedenteFamiliar;
    private String habitos;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Consulta codConsulta;
    


}
