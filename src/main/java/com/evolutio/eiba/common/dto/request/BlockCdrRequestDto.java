package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entrada DTO de un bloque de audio.
 *
 * @author Evolutio
 */
@Schema(title = "BlockCdrRequestDto", description = "DTO de entrada de un bloque de audio.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockCdrRequestDto {

  @NotNull
  @Parameter(description = "El identificador del audio.")
  private Long audioId;

  @NotBlank
  @Size(max = 50)
  @Parameter(description = "Identificador de la conversación.")
  private String conversationId;

  @NotNull
  @Parameter(description = "Fecha de inicio del bloque.")
  private BigDecimal startTime;

  @NotNull
  @Parameter(description = "Fecha de fin del bloque.")
  private BigDecimal endTime;

  @Size(max = 100)
  @Parameter(description = "Razón de la terminación del bloque.")
  private String blockTerminationReason;

  @Size(max = 100)
  @Parameter(description = "Detalle de la terminación del bloque.")
  private String blockTerminationDetail;

  @Size(max = 100)
  @Parameter(description = "Detalle del nombre del bloque.")
  private String blockDetailName;

  @Size(max = 1024)
  @Parameter(description = "Detalle de la descripción del bloque.")
  private String blockDetailDescription;

  @Size(max = 100)
  @Parameter(description = "Detalle del tipo de bloque.")
  private String blockDetailType;
}
