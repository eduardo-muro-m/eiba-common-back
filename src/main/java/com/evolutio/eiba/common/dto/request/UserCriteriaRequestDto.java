package com.evolutio.eiba.common.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * DTO de entrada de un usuario.
 *
 * @author Evolutio
 */
@Schema(title = "UserCriteriaRequestDto", description = "DTO de entrada para filtrar usuarios.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCriteriaRequestDto {

  @Size(max = 100)
  @Parameter(description = "Nombre del usuario.")
  private String name;

  @Size(max = 100)
  @Parameter(description = "Email del usuario.", example = "info@evolutio.com")
  private String email;

  @Parameter(description = "El identificador de la compañía por la que filtrar.")
  private Integer companyId;

  @Min(value = 1)
  @Parameter(description = "El identificador del rol por el que filtrar.")
  private Integer roleId;

  @Parameter(description = "Estado por el que filtrar.")
  private StatusEnum status;
}
