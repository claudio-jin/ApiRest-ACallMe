package br.com.fiap.Challengesprint3.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.fiap.Challengesprint3.models.Paciente;

public class DetalheUsuarioData implements UserDetails{

    private final Optional<Paciente> paciente;

    public DetalheUsuarioData(Optional<Paciente> paciente) {
        this.paciente = paciente;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }

    @Override
    public String getPassword() {
        return paciente.orElse(new Paciente()).getPassword();
    }

    @Override
    public String getUsername() {
        return paciente.orElse(new Paciente()).getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
