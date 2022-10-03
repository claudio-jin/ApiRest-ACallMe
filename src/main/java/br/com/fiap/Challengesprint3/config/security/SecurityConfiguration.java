package br.com.fiap.Challengesprint3.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration{
    
    // private final DetailUserServiceImpl usuarioService;
    // private final PasswordEncoder passwordEncoder;
    // private final AuthenticationManager authenticationManager;

    // public SecurityConfiguration(DetailUserServiceImpl usuarioService, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {
    //     this.usuarioService = usuarioService;
    //     this.passwordEncoder = passwordEncoder;
    //     this.authenticationManager = authenticationManager;
    // }

    // @Override
    // public void configure(AuthenticationManagerBuilder auth) throws Exception {
    //     auth.userDetailsService(usuarioService).passwordEncoder(passwordEncoder);
    // }

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
                // .addFilter(new JWTAuthenticFilter(authenticationManager))
                // .addFilter(new JWTValidFilter(authenticationManager))
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // @Bean
    // CorsConfigurationSource corsConfigurationSource() {
    //     final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

    //     CorsConfiguration corsConfiguration = new CorsConfiguration().applyPermitDefaultValues();
    //     source.registerCorsConfiguration("/**", corsConfiguration);
    //     return (CorsConfigurationSource) source;
    // }
}
