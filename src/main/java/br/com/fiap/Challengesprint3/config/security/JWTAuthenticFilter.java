// package br.com.fiap.Challengesprint3.config.security;

// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Date;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// import com.auth0.jwt.JWT;
// import com.auth0.jwt.algorithms.Algorithm;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import br.com.fiap.Challengesprint3.data.DetalheUsuarioData;
// import br.com.fiap.Challengesprint3.models.Paciente;

// public class JWTAuthenticFilter extends UsernamePasswordAuthenticationFilter{

//     public static final int TOKEN_EPIRACAO = 600_000;   //10 min

//     public static final String TOKEN_SENHA = "4a446440-8fa4-43f8-8b0b-86d99dbf94e5";

//     private final AuthenticationManager authenticationManager;

//     public JWTAuthenticFilter(AuthenticationManager authenticationManager) {
//         this.authenticationManager = authenticationManager;
//     }

//     @Override
//     public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//             throws AuthenticationException {
//         try {
//             Paciente paciente = new ObjectMapper().readValue(request.getInputStream(), Paciente.class);

//             return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                 paciente.getEmail(),
//                 paciente.getPassword(),
//                 new ArrayList<>()
//             ));
//         } catch (IOException e) {
//             throw new RuntimeException("Falha ao autenticar usuario", e);
//         }
//     }

//     //geração de token
//     @Override
//     protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
//             Authentication authResult) throws IOException, ServletException {
//         DetalheUsuarioData usuarioData = (DetalheUsuarioData) authResult.getPrincipal();

//         String token = JWT.create()
//                         .withSubject(usuarioData.getUsername())
//                         .withExpiresAt(new Date(System.currentTimeMillis() + TOKEN_EPIRACAO))
//                         .sign(Algorithm.HMAC512(TOKEN_SENHA));
        
//         response.getWriter().write(token);
//         response.getWriter().flush();
//     }
// }
