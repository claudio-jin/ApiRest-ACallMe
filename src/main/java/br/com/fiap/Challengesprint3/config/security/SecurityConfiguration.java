package br.com.fiap.Challengesprint3.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.fiap.Challengesprint3.serviceImpl.DetailUserServiceImpl;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration {
    
    // @Autowired
    // private  DetailUserServiceImpl usuarioService;

    // @Autowired
    // private PasswordEncoder passwordEncoder;
    // private final AuthenticationManager authenticationManager;

    // public SecurityConfiguration(DetailUserServiceImpl usuarioService, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {
    //     this.usuarioService = usuarioService;
    //     this.passwordEncoder = passwordEncoder;
    //     this.authenticationManager = authenticationManager;
    // }

    // @Bean
    // protected void configure(HttpSecurity http) throws Exception {
    //     http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
    //     .disable().authorizeRequests().antMatchers("/").permitAll()
    //     .antMatchers("/index").permitAll()
    //     .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
    //     //Redireciona ou da um retorno para index quando desloga do sistema
    //     .anyRequest().authenticated().and().logout().logoutSuccessUrl("/index")

    //     //mapeia o logout do sistema
    //     .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

    //     //Filtra as requisicoes para login de jwt
    //     .and().addFilterAfter(new JWTLoginFilter("/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)

    //     .addFilterBefore(new JWTApiAutenticacaoFilter(), UsernamePasswordAuthenticationFilter.class);
    // }


    //Atualizado apos video jdev 26:05
    //ira consultar o user no banco com spring security
    // @Bean
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
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
                .antMatchers(HttpMethod.POST, "/api/paciente/role/**").permitAll()
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
