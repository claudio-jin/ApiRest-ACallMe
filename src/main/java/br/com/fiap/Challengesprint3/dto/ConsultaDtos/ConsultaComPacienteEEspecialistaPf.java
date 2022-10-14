package br.com.fiap.Challengesprint3.dto.ConsultaDtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.fiap.Challengesprint3.models.Consulta;

public class ConsultaComPacienteEEspecialistaPf {
    //Consulta
    // private Long codConsulta;

    private Double valorConfirmado;

	@JsonFormat(pattern="dd/MM/yyyy")
    private Date dtConsulta;

    //Paciente
    private Long idPaciente;

    private String nomePaciente;

    //Especialista
    private Long idEspecialistaPf;

    private String nomeEspecialistaPf;

    public ConsultaComPacienteEEspecialistaPf(Consulta cn) {
        this.valorConfirmado = cn.getValorConfirmado();
        this.dtConsulta = cn.getDtConsulta();
        this.idPaciente = cn.getPaciente().getId();
        this.nomePaciente = cn.getPaciente().getNomePaciente();
        this.idEspecialistaPf = cn.getEspePf().getCodEspecialista();
        this.nomeEspecialistaPf = cn.getEspePf().getNomeEspecialista();
    }
    
    public ConsultaComPacienteEEspecialistaPf(Double valorConfirmado, Date dtConsulta, Long idPaciente,
            String nomePaciente, Long idEspecialistaPf, String nomeEspecialistaPf) {
        this.valorConfirmado = valorConfirmado;
        this.dtConsulta = dtConsulta;
        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.idEspecialistaPf = idEspecialistaPf;
        this.nomeEspecialistaPf = nomeEspecialistaPf;
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

    public Long getIdEspecialistaPf() {
        return idEspecialistaPf;
    }

    public void setIdEspecialistaPf(Long idEspecialistaPf) {
        this.idEspecialistaPf = idEspecialistaPf;
    }

    public String getNomeEspecialista() {
        return nomeEspecialistaPf;
    }

    public void setNomeEspecialista(String nomeEspecialistaPf) {
        this.nomeEspecialistaPf = nomeEspecialistaPf;
    }
}
