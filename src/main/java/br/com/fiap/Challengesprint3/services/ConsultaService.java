package br.com.fiap.Challengesprint3.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDto;
import br.com.fiap.Challengesprint3.models.Consulta;
import br.com.fiap.Challengesprint3.repository.ConsultaRepository;

@Service
public class ConsultaService {
    
    @Autowired
    ConsultaRepository repository;
    
    public List<Consulta> listAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(Consulta consulta) {
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

}
