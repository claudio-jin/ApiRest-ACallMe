package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;

public class ConsultaComPacienteEEspecialistaPj {
    //Consulta
    // private Long codConsulta;

    private Double valorConfirmado;

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;

    //Paciente
    private Long idPaciente;

    private String nomePaciente;

    //Especialista
    private Long idEspecialistaPj;

    private String nomeEspecialistaPj;

    public ConsultaComPacienteEEspecialistaPj(Consulta cn) {
        this.valorConfirmado = cn.getValorConfirmado();
        this.dtConsulta = cn.getDtConsulta();
        this.idPaciente = cn.getPaciente().getId();
        this.nomePaciente = cn.getPaciente().getNomePaciente();
        this.idEspecialistaPj = cn.getEspePj().getCodEspecialista();
        this.nomeEspecialistaPj = cn.getEspePj().getNomeEspecialista();
    }

    public ConsultaComPacienteEEspecialistaPj(Double valorConfirmado, Date dtConsulta, Long idPaciente,
            String nomePaciente, Long idEspecialistaPj, String nomeEspecialistaPj) {
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.idEspecialistaPj = idEspecialistaPj;
        this.nomeEspecialistaPj = nomeEspecialistaPj;
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

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Long getIdEspecialista() {
        return idEspecialistaPj;
    }

    public void setIdEspecialista(Long idEspecialistaPj) {
        this.idEspecialistaPj = idEspecialistaPj;
    }

    public String getNomeEspecialista() {
        return nomeEspecialistaPj;
    }

    public void setNomeEspecialista(String nomeEspecialistaPj) {
        this.nomeEspecialistaPj = nomeEspecialistaPj;
    }
}
