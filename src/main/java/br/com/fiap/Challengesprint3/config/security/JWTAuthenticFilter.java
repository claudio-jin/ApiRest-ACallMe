package br.com.fiap.Challengesprint3.config.security;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.ApplicationContextLoad;
import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
@Component
public class JWTAuthenticFilter extends UsernamePasswordAuthenticationFilter{

    //TOKEN de validade de 11 dias
    public static final long EXPIRATION_TIME = 959990000;   //11 dias

    //CHAVE de senha para juntar com o jwt
    public static final String SECRET = "4a446440-8fa4-43f8-8b0b-86d99dbf94e5";
    
    private static final String TOKEN_PREFIX = "Bearer";

    private static final String HEADER_STRING = "Authorization";

    //Gera o token e da a resposta para o cliente com o jwt
    public void addAuthentication(HttpServletResponse response, String username) throws Exception{

        //Montagem do Token
        String JWT = Jwts.builder() //Chama o gerador de token
                        .setSubject(username) //Adiciona o user
                        .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) //Tempo de expiração
                        .signWith(SignatureAlgorithm.HS512, SECRET).compact();

        //Ex: Bearer asdgfadsfgadfgafsdgas.fbsdfvbdyhj.asdgfascdva
        String token = TOKEN_PREFIX + " " + JWT;

        //Da a resposta para tela e para o cliente, outra api, navegador, app, javascript, outra chamada java
        response.addHeader(HEADER_STRING, token);

        liberacaoCors(response);
        //Usado para ver no postman para testes
        response.getWriter().write("{\"Authorization\": \"" + token + "\"}");

    }

    //Retorna o usuario validade com token ou caso nao seja valido retorna null
    public Authentication getAuthentication(HttpServletRequest request, HttpServletResponse response) {
        String token = request.getHeader(HEADER_STRING);

        if(token != null) {
            String tokenLimpo = token.replace(TOKEN_PREFIX, "").trim();

            //Faz a validação do token do usuario na requisicao e obtem o user
            String user = Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(tokenLimpo)
                        .getBody().getSubject(); //Admin ou alex
            if(user != null) {
                //Verificar uso do optional
                Optional<Paciente> usuario = ApplicationContextLoad.getApplicationContext().getBean(PacienteRepository.class).findByEmail(user);
                if(usuario != null) {
                    return new UsernamePasswordAuthenticationToken(usuario.getEmail(), usuario.getPassword(), new ArrayList<>());
                }
            }


        }

        liberacaoCors(response);
        return null;
    }


    //Fazendo liberacao contra erro de cors no navegador
    //Erro de cors
    private void liberacaoCors(HttpServletResponse response) {
        if(response.getHeader("Access-Control-Allow-Origin") == null) {
            response.addHeader("Access-Control-Allow-Origin", "*");
        }


        if(response.getHeader("Access-Control-Allow-Headers") == null) {
            response.addHeader("Access-Control-Allow-Headers", "*");
        }

        
        if(response.getHeader("Access-Control-Request-Origin") == null) {
            response.addHeader("Access-Control-Request-Origin", "*");
        }

        
        if(response.getHeader("Access-Control-Allow-Methods") == null) {
            response.addHeader("Access-Control-Allow-Methods", "*");
        }
    }


    //private final AuthenticationManager authenticationManager;


    // public JWTAuthenticFilter(AuthenticationManager authenticationManager) {
    //     this.authenticationManager = authenticationManager;
    // }

    // @Override
    // public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
    //         throws AuthenticationException {
    //     try {
    //         Paciente paciente = new ObjectMapper().readValue(request.getInputStream(), Paciente.class);

    //         return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
    //             paciente.getEmail(),
    //             paciente.getPassword(),
    //             new ArrayList<>()
    //         ));
    //     } catch (IOException e) {
    //         throw new RuntimeException("Falha ao autenticar usuario", e);
    //     }
    // }

    // //geração de token
    // @Override
    // protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
    //         Authentication authResult) throws IOException, ServletException {
    //     DetalheUsuarioData usuarioData = (DetalheUsuarioData) authResult.getPrincipal();

    //     String token = JWT.create()
    //                     .withSubject(usuarioData.getUsername())
    //                     .withExpiresAt(new Date(System.currentTimeMillis() + TOKEN_EPIRACAO))
    //                     .sign(Algorithm.HMAC512(TOKEN_SENHA));
        
    //     response.getWriter().write(token);
    //     response.getWriter().flush();
    // }
}
