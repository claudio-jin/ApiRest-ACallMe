package br.com.fiap.Challengesprint3.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;

@Service
@Transactional
public class DetailUserServiceImpl implements UserDetailsService{

    @Autowired
    PacienteRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Paciente> paciente = repository.findByEmail(username);
        if (paciente.isPresent()) return paciente.get();
        throw new UsernameNotFoundException("User not found: " + username);
            
    }
    

    // .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    //     return new User(paciente.getEmail(), paciente.getPassword(), true, true, true, true, paciente.getAuthorities());
}
