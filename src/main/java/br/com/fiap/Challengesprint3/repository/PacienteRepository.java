package br.com.fiap.Challengesprint3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.fiap.Challengesprint3.models.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

    Optional<Paciente> findByEmail(String email); 

    // @Query(value = "SELECT p FROM Paciente p WHERE p.nomePaciente = ?1")
    // Paciente findByUsername(String username);

    // @Query(value = "SELECT p FROM Paciente p WHERE p.email = ?1 AND p.password = ?2")
    // List<Paciente> login(String username, String password);

    List<Paciente> findByEmailAndPassword(String email, String password);
}
