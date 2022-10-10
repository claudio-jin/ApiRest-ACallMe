package br.com.fiap.Challengesprint3.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import br.com.fiap.Challengesprint3.models.JwtToken;
import br.com.fiap.Challengesprint3.models.Usuario;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity<Object> auth(@RequestBody Usuario usuario) {
        try {
            Authentication authentication = new UsernamePasswordAuthenticationToken(usuario.getUsername(),
                    usuario.getPassword());
            authenticationManager.authenticate(authentication);

            // gerar o token
            // Tempo de expiração do token
            Date issuedAt = new Date();
            Date expiresAt = new Date(issuedAt.getTime() + 60_000); // 1hr
            // Montando o token
            String token = JWT.create()
                    .withSubject(usuario.getEmail())
                    .withIssuedAt(issuedAt)
                    .withExpiresAt(expiresAt)
                    .sign(Algorithm.HMAC512("secret"));

            return ResponseEntity.ok(new JwtToken(token));
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
