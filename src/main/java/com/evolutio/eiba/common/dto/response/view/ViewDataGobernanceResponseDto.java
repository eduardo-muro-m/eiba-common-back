package com.evolutio.eiba.common.dto.response.view;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Schema(hidden = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SuperBuilder
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewDataGobernanceResponseDto {

  @Parameter(description = "El identificador del tenant.")
  private int tenantId;

  @Parameter(description = "El nombre del tenant.")
  private String tenantName;

  @Parameter(description = "El identificador de la compañía.")
  private String companyId;

  @Parameter(description = "El nombre de la compañía.")
  private String companyName;
}
