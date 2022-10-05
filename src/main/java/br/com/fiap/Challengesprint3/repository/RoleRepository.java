package br.com.fiap.Challengesprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.Challengesprint3.models.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Long>{
    
}
