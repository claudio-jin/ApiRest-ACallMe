package br.com.fiap.Challengesprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.Challengesprint3.models.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
