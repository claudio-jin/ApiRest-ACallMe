package br.com.fiap.Challengesprint3.models;

import lombok.Data;

@Data
public class Chamada {
    private Long id;
    private int codChamada;
    private int duracaoChamada;
    private int avaliacao;
}
