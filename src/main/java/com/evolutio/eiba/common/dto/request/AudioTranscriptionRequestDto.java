package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entrada DTO de una trancripción de audio.
 *
 * @author Evolutio
 */
@Schema(
    title = "AudioTranscriptionRequestDto",
    description = "DTO de entrada de una transcripción de audio.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class AudioTranscriptionRequestDto {

  @NotBlank
  @Size(max = 50)
  @Parameter(description = "El identificador de la conversacion.")
  private String conversationId;

  @NotNull
  @Parameter(description = "El identificador del audio.")
  private Long audioId;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "Orden de la transcripción.")
  private Integer segment;

  @NotNull
  @Parameter(description = "Tiempo de inicio de la transcripción.")
  private BigDecimal startTime;

  @NotNull
  @Parameter(description = "Tiempo del final de la transcripción.")
  private BigDecimal endTime;

  @NotBlank
  @Size(max = 1024)
  @Parameter(description = "Transcripción.")
  private String transcription;

  @NotBlank
  @Size(max = 15)
  @Parameter(description = "Fuente de la transcripción.")
  private String source;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "El identificador del bloque.")
  private Long blockId;
}
