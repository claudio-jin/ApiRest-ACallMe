package br.com.fiap.Challengesprint3.service;
// package br.com.fiap.Challengesprint3.services;

// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;

// import br.com.fiap.Challengesprint3.models.Paciente;
// import br.com.fiap.Challengesprint3.repository.PacienteRepository;

// public class AuthenticationService implements UserDetailsService {

//     @Autowired
//     PacienteRepository pacienteRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         Optional<Paciente> paciente = pacienteRepository.findByEmail(username);
//         if(paciente.isPresent()) return paciente.get();
//         throw new UsernameNotFoundException("user not found " + username);
//     }
    
// }
