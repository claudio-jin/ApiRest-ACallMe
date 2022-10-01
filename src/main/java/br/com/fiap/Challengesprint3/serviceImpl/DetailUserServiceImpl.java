package br.com.fiap.Challengesprint3.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.fiap.Challengesprint3.data.DetalheUsuarioData;
import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;

@Component
public class DetailUserServiceImpl implements UserDetailsService{

    @Autowired
    PacienteRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Paciente> paciente = repository.findByEmail(username);
        if(paciente.isEmpty()) {
            throw new UsernameNotFoundException("User not found" + username);
        }
        return new DetalheUsuarioData(paciente);
    }
    
}
