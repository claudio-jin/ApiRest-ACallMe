package br.com.fiap.Challengesprint3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.dto.roles.CreateUserRoleDto;
import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.models.RoleModel;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;

@Service
public class CreateRoleUserService {
    
    @Autowired
    PacienteRepository repository;

    public Paciente execute(CreateUserRoleDto dto) {
        Optional<Paciente> pacientExists = repository.findById(dto.getId());
        List<RoleModel> roles = new ArrayList<>(); 
        
        if(pacientExists.isEmpty()) {
            throw new Error("User not exists");
        }

        roles = dto.getIdsRoles().stream().map(role -> {
            return new RoleModel();
        }).collect(Collectors.toList());

        Paciente paciente = pacientExists.get();

        paciente.setRoles(roles);

        repository.save(paciente);

        return paciente;
    }
}
