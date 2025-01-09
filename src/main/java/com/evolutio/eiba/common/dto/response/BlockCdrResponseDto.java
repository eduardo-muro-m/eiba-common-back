package com.evolutio.eiba.common.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Schema(title = "BlockCdrResponseDto", description = "DTO de respuesta de bloques de audios.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class BlockCdrResponseDto {

  @Parameter(description = "Identificador del objeto de la vista.")
  private Long id;

  @Parameter(description = "El identificador del audio.")
  private Long audioId;

  @Parameter(description = "Identificador de la conversación.")
  private String conversationId;

  @Parameter(description = "Fecha de inicio del bloque.")
  private BigDecimal startTime;

  @Parameter(description = "Fecha de fin del bloque.")
  private BigDecimal endTime;

  @Parameter(description = "Razón de la terminación del bloque.")
  private String blockTerminationReason;

  @Parameter(description = "Detalle de la terminación del bloque.")
  private String blockTerminationDetail;

  @Parameter(description = "Detalle del nombre del bloque.")
  private String blockDetailName;

  @Parameter(description = "Detalle de la descripción del bloque.")
  private String blockDetailDescription;

  @Parameter(description = "Detalle del tipo de bloque.")
  private String blockDetailType;
}
