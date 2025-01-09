package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * Entrada DTO de una conversación.
 *
 * @author Evolutio
 */
@Schema(
    title = "WsInteractionCdrRequestDto",
    description = "DTO de entrada de una interacción con Web Service.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class WsInteractionCdrRequestDto {

  @NotNull
  @Size(max = 50)
  @Parameter(description = "Identificador de la conversacion de la interacción.")
  private String conversationId;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "Identificador del bloque asociado a la interacción.")
  private Long blockId;

  @NotNull
  @Parameter(description = "Código del resultado de la invocación al WS.")
  private Integer http_code;

  @NotNull
  @Size(max = 500)
  @Parameter(description = "Detalle del resultado de la invocación al WS.")
  private String http_result;

  @NotNull
  @Parameter(description = "Duración de la invocación al WS.")
  private Integer latency;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "La hora y fecha de la interacción.")
  private LocalDateTime exec_datetime;

  @Size(max = 100)
  @Parameter(description = "Endpoint invocado en la interacción.")
  private String endpoint;
}
