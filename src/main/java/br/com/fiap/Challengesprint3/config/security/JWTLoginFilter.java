// package br.com.fiap.Challengesprint3.config.security;

// import java.io.IOException;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

// import com.fasterxml.jackson.databind.ObjectMapper;

// import br.com.fiap.Challengesprint3.models.Paciente;

// public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

//     // Configurando o gerenciador de autenticacao
//     public JWTLoginFilter(String url, AuthenticationManager authenticationManager) {
//         // Obriga a autenticar a url
//         super(new AntPathRequestMatcher(url));
//         // Gerenciador de autenticacao
//         setAuthenticationManager(authenticationManager);
//     }

//     // Retorna o usuario ao processar a autenticacao
//     @Override
//     public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//             throws AuthenticationException, IOException, ServletException {

//         //Obtem usuario
//         Paciente user = new ObjectMapper().readValue(request.getInputStream(), Paciente.class);
//         //Retorna o user com login e senha
//         return getAuthenticationManager()
//                 .authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
//     }

//     @Override
//     protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
//             Authentication authResult) throws IOException, ServletException {

//         try {
//             new JWTAuthenticFilter().addAuthentication(response, authResult.getName());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }
