package com.evolutio.eiba.common.exception;

/**
 * Excepción genérica para prohibir acciones de usuario.
 *
 * @author Evolutio
 */
public class ForbiddenException extends RuntimeException {

  private static final long serialVersionUID = -9129275363390313466L;

  /**
   * Constructor.
   *
   * @param message Mensaje de la excepción
   */
  public ForbiddenException(String message) {
    super(message);
  }
}
