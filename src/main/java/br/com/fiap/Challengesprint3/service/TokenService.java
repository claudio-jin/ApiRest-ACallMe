package br.com.fiap.Challengesprint3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;


public class TokenService {
    
    @Autowired
    PacienteRepository repository;

    public boolean validate(String token) {

        try{
            JWT.require(Algorithm.HMAC512("secret")).build().verify(token);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    public Authentication getAuthenticationToken(String token) {
        String email = JWT.require(Algorithm.HMAC512("secret")).build().verify(token).getSubject();
        
        Optional<Paciente> optional = repository.findByEmail(email);
        if (optional.isEmpty()) return null;
        var user = optional.get();
        Authentication authentication = 
                new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        
        return authentication;
    }
    
}
