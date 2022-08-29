package br.com.fiap.Challengesprint3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
}
