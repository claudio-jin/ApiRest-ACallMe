package br.com.fiap.Challengesprint3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.models.Prontuario;
import br.com.fiap.Challengesprint3.repository.ProntuarioRepository;

@Service
public class ProntuarioService {
    
    @Autowired
    ProntuarioRepository repository;

    public List<Prontuario> listAll() {
        return repository.findAll();
    }

    public void save(Prontuario prontuario) {
        repository.save(prontuario);
    }

    public Optional<Prontuario> getById(Long id) {
        return repository.findById(id);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }
}
