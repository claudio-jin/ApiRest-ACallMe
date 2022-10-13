package br.com.fiap.Challengesprint3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import br.com.fiap.Challengesprint3.models.Usuario;
import br.com.fiap.Challengesprint3.repository.UsuarioRepository;


public class TokenService {
    
    @Autowired
    UsuarioRepository repository;

    //Valida o token e o algoritmo utilizado
    //Passando como senha a string "secret" para decodificação
    public boolean validate(String token) {

        try{
            JWT.require(Algorithm.HMAC512("secret")).build().verify(token);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    //Autenticação do token pelo subject (Valor contido no subject é o email)
    public Authentication getAuthenticationToken(String token) {
        //Retorna o valor do subject
        //Quando geramos o token colocamos pra receber o email
        String email = JWT.require(Algorithm.HMAC512("secret")).build().verify(token).getSubject();
        
        Optional<Usuario> optional = repository.findByEmail(email);
        if (optional.isEmpty()) return null;
        var user = optional.get();
        Authentication authentication = 
                new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        
        return authentication;
    }
    
}
