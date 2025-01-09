package com.evolutio.eiba.common.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * DTO de entrada de un usuario SAML.
 *
 * @author Evolutio
 */
@Schema(title = "UserSamLRequestDto", description = "DTO de entrada un suaurio SAML.")
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSamLRequestDto {

  @NotBlank
  @Size(max = 100)
  @Parameter(description = "Email del usuario.", example = "info@evolutio.com")
  private String email;

  @NotBlank
  @Size(max = 100)
  @Parameter(description = "Pefil/RolSamL del usuario en el AD.")
  private String roleSaml;

  @Size(max = 100)
  @Parameter(description = "Nombre del usuario.")
  private String name;

  @Size(max = 100)
  @Parameter(description = "Primer Apellido.")
  private String surname1;

  @Size(max = 100)
  @Parameter(description = "Segundo Apellido.")
  private String surname2;
}
