package br.com.fiap.Challengesprint3.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {     
        http.httpBasic()
            .and()
            .authorizeHttpRequests()
                .antMatchers(HttpMethod.GET, "/api/paciente/**").permitAll()
                .antMatchers(HttpMethod.POST, "/api/paciente").permitAll()
                .antMatchers(HttpMethod.PUT, "/api/paciente/**").permitAll()
                .antMatchers(HttpMethod.DELETE, "/api/paciente/**").authenticated()
                .anyRequest().denyAll()
            .and()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
