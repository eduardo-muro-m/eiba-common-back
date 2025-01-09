package com.evolutio.eiba.common.dto.response.view;

import java.time.LocalDateTime;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Schema(
    title = "ViewUserResponseDto",
    description = "DTO de respuesta de un objeto de la vista de usuarios.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewUserResponseDto {

  @Parameter(description = "Identificador del usuario.", example = "1")
  private Integer id;

  @Parameter(description = "Nombre del usuario.", example = "Manuel")
  private String name;

  @Parameter(description = "Email del usuario.", example = "info@manuel.com")
  private String email;

  @Parameter(description = "Indica si debe cambiar la password el usuario.", example = "true")
  private boolean mustChangePassword;

  @Parameter(description = "El rol por defecto del usuario.")
  private int defaultRoleId;

  @Parameter(description = "La compañía por defecto del usuario.")
  private int defaultCompanyId;

  @Parameter(description = "Estado del usuario.", example = "ACTIVE")
  private StatusEnum status;

  @Parameter(description = "Identificador del tenant al que pertenece el usuario.")
  private int tenantId;

  @Parameter(description = "Primer apellido del usuario.", example = "Prueba")
  private String surname1;

  @Parameter(description = "Segundo apellido del usuario.", example = "Seguida")
  private String surname2;

  @Parameter(description = "Lenguaje por defecto del usuario.")
  private String defaultLanguage;

  @Parameter(description = "El nombre del rol.")
  private String roleName;

  @Parameter(description = "El nombre de la compañía.")
  private String companyName;

  @Parameter(description = "El nombre del tenant.")
  private String tenantName;

  @Parameter(description = "Indica si la autentificacion de usuario es SamL.")
  private Boolean isAuthSaml;

  @Parameter(description = "Zona horaria por defecto")
  private String timeZone;

  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "Fecha Ultimo cambio de contraseña.")
  private LocalDateTime fxLastChangePassword;

  @Parameter(description = "Intentos de logarse fallidos.")
  private int loginAttempts;

  @Column(name = "Indica si se chequea los accesos")
  private Boolean checkAccess;
}
