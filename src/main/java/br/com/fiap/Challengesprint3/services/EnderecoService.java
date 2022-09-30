package br.com.fiap.Challengesprint3.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.Challengesprint3.dto.EnderecoDtos.EnderecoDto;
import br.com.fiap.Challengesprint3.models.Endereco;
import br.com.fiap.Challengesprint3.repository.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    EnderecoRepository repository;

    @Autowired
    ModelMapper modelMapper;
    
    public List<Endereco> listAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(Endereco endereco) {
        repository.save(endereco);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Endereco> getById(Long id) {
        return repository.findById(id);
    }

    public List<EnderecoDto> listEnderecoDto() {
        return repository.findAll()
                    .stream()
                    .map(this::toEnderecoDto)
                    .collect(Collectors.toList());
    }

    public EnderecoDto toEnderecoDto(Endereco endereco) {
        return modelMapper.map(endereco, EnderecoDto.class);
    }

}