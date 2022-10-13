// package br.com.fiap.Challengesprint3.service;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;
// import java.util.Set;
// import java.util.stream.Collectors;

// import javax.transaction.Transactional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import br.com.fiap.Challengesprint3.dto.roles.CreateUserRoleDto;
// import br.com.fiap.Challengesprint3.models.Paciente;
// import br.com.fiap.Challengesprint3.models.RoleModel;
// import br.com.fiap.Challengesprint3.repository.PacienteRepository;
// import br.com.fiap.Challengesprint3.repository.RoleRepository;

// @Transactional
// @Service
// public class CreateRoleUserService {
    
//     @Autowired
//     PacienteRepository repository;

//     @Autowired
//     RoleRepository roleRepository;

//     // public Paciente execute(CreateUserRoleDto dto) {
//     //     Optional<Paciente> pacientExists = repository.findById(dto.getIdUser());
//     //     Set<RoleModel> roles ; 
        
//     //     if(pacientExists.isEmpty()) {
//     //         throw new Error("User not exists");
//     //     }

//     //     roles = dto.getIdsRoles().stream().map(role -> {
//     //         return new RoleModel(role);
//     //     }).collect(Collectors.toSet());

//     //     Paciente paciente = pacientExists.get();

//     //     paciente.setRoles(roles);

//     //     repository.save(paciente);

//     //     return paciente;
//     // }

//     public void createRole(RoleModel role) {
//         roleRepository.save(role);
//     }

//     public List<RoleModel> getRoles() {
//         return roleRepository.findAll();
//     }

// }
