package br.com.fiap.Challengesprint3.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfiguration {

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                    .authorizeHttpRequests()

                    //Login -> criação de token
                    .antMatchers(HttpMethod.POST, "/api/auth").permitAll()

                    // paciente
                    .antMatchers(HttpMethod.GET, "/api/paciente/**").permitAll()
                    .antMatchers(HttpMethod.POST, "/api/paciente").permitAll()
                    .antMatchers(HttpMethod.PUT, "/api/paciente/**").authenticated()
                    .antMatchers(HttpMethod.DELETE, "/api/paciente/**").authenticated()

                    // EspecialistaPf
                    .antMatchers(HttpMethod.GET, "/api/especialistaPf/**").permitAll()
                    .antMatchers(HttpMethod.POST, "/api/especialistaPf").permitAll()
                    .antMatchers(HttpMethod.PUT, "/api/especialistaPf/**").authenticated()
                    .antMatchers(HttpMethod.DELETE, "/api/especialistaPf/**").authenticated()

                    // EspecialistaPj
                    .antMatchers(HttpMethod.GET, "/api/especialistaPj/**").permitAll()
                    .antMatchers(HttpMethod.POST, "/api/especialistaPj").permitAll()
                    .antMatchers(HttpMethod.PUT, "/api/especialistaPj/**").authenticated()
                    .antMatchers(HttpMethod.DELETE, "/api/especialistaPj/**").authenticated()

                    // roles
                    .antMatchers(HttpMethod.POST, "/api/paciente/role/**").permitAll()

                    .anyRequest().denyAll()
                .and()
                    .csrf().disable()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                    .headers().frameOptions().disable()    
                .and()
                    .addFilterBefore(new AuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    
}
