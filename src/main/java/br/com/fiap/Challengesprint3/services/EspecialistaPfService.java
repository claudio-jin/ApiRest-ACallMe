package br.com.fiap.Challengesprint3.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.Challengesprint3.dto.EspecialistaPfDtos.EspecialistaPfDto;
import br.com.fiap.Challengesprint3.models.EspecialistaPf;
import br.com.fiap.Challengesprint3.repository.EspecialistaPfRepository;

@Service
public class EspecialistaPfService {

	@Autowired
	EspecialistaPfRepository repository;
	
	public List<EspecialistaPf> listAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(EspecialistaPf EspecialistaPf) {
        repository.save(EspecialistaPf);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<EspecialistaPf> getById(Long id) {
        return repository.findById(id);
    }

    public List<EspecialistaPfDto> getEspecialistaPfDto() {
        List<EspecialistaPf> especialistas = repository.findAll();
        List<EspecialistaPfDto> dto = especialistas.stream().map( e -> new EspecialistaPfDto(e)).collect(Collectors.toList());
        return dto;
    }
	
}
