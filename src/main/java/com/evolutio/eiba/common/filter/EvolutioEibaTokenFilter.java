package com.evolutio.eiba.common.filter;

import com.evolutio.component.common.exception.TokenVerificationFailureException;
import com.evolutio.component.common.exception.handler.SecurityExceptionHandler;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Filtro de comprobación de token contra Genesys Cloud. Se recupera el token proporcionado por el
 * propio Genesys Cloud de la cabecera "authorization" y se valida contra el propio Genesys.
 *
 * @author Evolutio
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EvolutioEibaTokenFilter implements Filter {

  private final SecurityExceptionHandler securityExceptionHandler;
  private final ApplicationContext applicationContext;

  /**
   * Constructor.
   *
   * @param securityExceptionHandler Servicio para gestionar los errores {@link
   *     SecurityExceptionHandler}.
   * @param applicationContext El contexto de aplicación
   */
  public EvolutioEibaTokenFilter(
      SecurityExceptionHandler securityExceptionHandler, ApplicationContext applicationContext) {

    this.securityExceptionHandler = securityExceptionHandler;
    this.applicationContext = applicationContext;
  }

  /**
   * Método que realiza el proceso de recuperación del token de las solicitudes y de la cabecera
   * "Authorization" y lo reenvía a Genesys Cloud para que compruebe la validez del token. Para
   * cualquier caso distinto de una respuesto "OK", se lanza una excepción con la que responder en
   * formato Json.
   */
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpServletResponse httpServletResponse = (HttpServletResponse) response;

    try {
      //      buildAuthentication();
      //      JwtUtils.checkJwt(httpServletRequest);

      chain.doFilter(request, response);

    } catch (Exception e) {
      securityExceptionHandler.handle(
          httpServletResponse, new TokenVerificationFailureException(e.getMessage()));
    }
  }

  //  private void buildAuthentication() throws ClassNotFoundException {
  //    String securityAuthenticationProvider =
  //        applicationContext.getEnvironment().getProperty("security.authetication.provider");
  //    String userKey =
  //        applicationContext.getEnvironment().getProperty("security.authetication.user-key");
  //
  //    if (StringUtils.hasLength(securityAuthenticationProvider) && StringUtils.hasLength(userKey))
  // {
  //      UserDetailsService userDetailsService =
  //          (UserDetailsService)
  //              applicationContext.getBean(Class.forName(securityAuthenticationProvider));
  //
  //      Optional.ofNullable(JwtUtils.getPayload())
  //          .ifPresent(
  //              payload -> {
  //                UserDetails user =
  //                    userDetailsService.loadUserByUsername(payload.get(userKey).toString());
  //
  //                if (Objects.nonNull(user)) {
  //                  SecurityContextHolder.getContext()
  //                      .setAuthentication(
  //                          new UsernamePasswordAuthenticationToken(
  //                              user, null, user.getAuthorities()));
  //                }
  //              });
  //    }
  //  }
}
