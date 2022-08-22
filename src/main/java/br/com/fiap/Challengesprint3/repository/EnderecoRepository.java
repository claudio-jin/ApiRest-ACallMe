package br.com.fiap.Challengesprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.Challengesprint3.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
