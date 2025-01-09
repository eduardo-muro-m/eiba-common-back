package com.evolutio.eiba.common.vo;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
    title = "MetadataDetailVo",
    description = "DTO de entrada del detalle de los metadatos de una conversación.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetadataDetailVo {

  @NotBlank
  @Parameter(description = "La clave por la que filtrar")
  private String key;

  @NotNull
  @Parameter(description = "El valor de la clave por la que filtrar")
  private String value;
}
