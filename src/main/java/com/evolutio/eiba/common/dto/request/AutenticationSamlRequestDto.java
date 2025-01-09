package com.evolutio.eiba.common.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
    title = "AutenticationSamlRequestDto",
    description = "DTO de entrada para obtencion de token usuario saml.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutenticationSamlRequestDto {

  @NotBlank
  @Size(max = 100)
  @Parameter(description = "Pefil del usuario en el AD.")
  private String roleSaml;

  @Parameter(description = "Email del usuario.")
  private String email;

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
