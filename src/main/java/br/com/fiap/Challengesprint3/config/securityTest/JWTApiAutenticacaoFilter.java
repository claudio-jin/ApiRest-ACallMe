//  package br.com.fiap.Challengesprint3.config.securityTest;

// import java.io.IOException;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRequest;
// import javax.servlet.ServletResponse;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.web.filter.GenericFilterBean;

// //Filtro onde todas as requisicoes serao capturadas para autenticar
// public class JWTApiAutenticacaoFilter extends GenericFilterBean {

//     @Override
//     public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//             throws IOException, ServletException {

//         // Estabelecer autenticacao do user
//         Authentication authentication = new JWTAuthenticFilter()
//                 .getAuthentication((HttpServletRequest) request, (HttpServletResponse) response);
        
//         //Coloca o processo de autenticacao para o spring security
//         SecurityContextHolder.getContext().setAuthentication(authentication);

//         chain.doFilter(request, response);
//     }

// }
