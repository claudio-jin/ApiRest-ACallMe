package br.com.fiap.Challengesprint3.dto.PacienteDtos;

import br.com.fiap.Challengesprint3.models.Paciente;

public class PacienteIdNomeDto {
    private Long id;

    private String nomePaciente;

    public PacienteIdNomeDto(Paciente paciente) {
        this.id = paciente.getId();
        this.nomePaciente = paciente.getNomePaciente();
    }
    
    public PacienteIdNomeDto(Long id, String nomePaciente) {
        this.id = id;
        this.nomePaciente = nomePaciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }


    
}
