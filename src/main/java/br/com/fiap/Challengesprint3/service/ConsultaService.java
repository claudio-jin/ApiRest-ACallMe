package br.com.fiap.Challengesprint3.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaComPacienteEEspecialistaPf;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDto;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDtoEspecialistaPf;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDtoEspecialistaPj;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaProntuarioDto;
import br.com.fiap.Challengesprint3.models.Consulta;
import br.com.fiap.Challengesprint3.models.EspecialistaPf;
import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.repository.ConsultaRepository;
import br.com.fiap.Challengesprint3.repository.EspecialistaPfRepository;
import br.com.fiap.Challengesprint3.repository.EspecialistaPjRepository;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;

@Transactional
@Service
public class ConsultaService {
    
    @Autowired
    ConsultaRepository repository;

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    EspecialistaPfRepository especialistaPfRepository;

    @Autowired
    EspecialistaPjRepository especialistaPjRepository;
    
    public List<Consulta> listAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(Consulta consulta) {
        repository.save(consulta);
    }

    //salvar paciente/espePf na consulta passando o id e o nome
    public void createConsultaComPacienteEspPf(ConsultaComPacienteEEspecialistaPf dto){
        Consulta consulta = new Consulta();

        Optional<Paciente> pacienteExist = pacienteRepository.findById(dto.getIdPaciente());
        if(pacienteExist.isEmpty()) throw new Error("User not found");

        Optional<EspecialistaPf> espPfExist = especialistaPfRepository.findById(dto.getIdEspecialistaPf());
        if(espPfExist.isEmpty()) throw new Error("User not found");

        Paciente paciente = pacienteExist.get();
        EspecialistaPf espePf = espPfExist.get();
        
        //testar passando parametros no construtor v2
        consulta.setPaciente(paciente);
        consulta.setEspePf(espePf);
        consulta.setValorConfirmado(dto.getValorConfirmado());
        consulta.setDtConsulta(dto.getDtConsulta());
        //Transformar dto em uma consulta e dps salvar a consulta
        repository.save(consulta);
    }
    

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Consulta> getById(Long id) {
        return repository.findById(id);
    }

    public List<ConsultaDto> getConsultaDto() {
        List<Consulta> consulta = repository.findAll();
        List<ConsultaDto> dto = consulta.stream().map(d -> new ConsultaDto(d)).collect(Collectors.toList());

        return dto;
    }

    public List<ConsultaDtoEspecialistaPf> getConsultaDtoEspecialistaPf() {
        List<Consulta> consulta = repository.findAll();
        List<ConsultaDtoEspecialistaPf> dto = consulta.stream().map(d -> new ConsultaDtoEspecialistaPf(d)).collect(Collectors.toList());

        return dto;
    }

    public List<ConsultaDtoEspecialistaPj> getConsultaDtoEspecialistaPj() {
        List<Consulta> consulta = repository.findAll();
        List<ConsultaDtoEspecialistaPj> dto = consulta.stream().map(d -> new ConsultaDtoEspecialistaPj(d)).collect(Collectors.toList());

        return dto;
    }

    
    public List<ConsultaProntuarioDto> getConsultaProntuarioDto() {
        List<Consulta> consulta = repository.findAll();
        List<ConsultaProntuarioDto> dto = consulta.stream().map(c -> new ConsultaProntuarioDto(c)).collect(Collectors.toList());
        return dto;
    }
}
