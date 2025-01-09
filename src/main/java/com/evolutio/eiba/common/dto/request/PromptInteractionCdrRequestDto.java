package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entrada DTO de una conversación.
 *
 * @author Evolutio
 */
@Schema(
    title = "PromptInteractionCdrRequestDto",
    description = "DTO de entrada de una interacción de tipo Prompt.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromptInteractionCdrRequestDto {

  @NotNull
  @Size(max = 50)
  @Parameter(description = "Identificador de la conversacion de la interacción.")
  private String conversationId;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "Identificador del bloque asociado a la interacción.")
  private Long blockId;

  @Parameter(description = "Identificador del audio asociado a la interacción.")
  private Long audioId;

  @Size(max = 1024)
  @Parameter(description = "Declaración.")
  private String utterance;

  @NotBlank
  @Size(max = 5)
  @Parameter(description = "Lenguaje de la interacción.")
  private String language;

  @Size(max = 100)
  @Parameter(description = "Tecnología de reconocimiento.")
  private String recognitionTechnology;

  @Size(max = 64)
  @Parameter(description = "El destino obtenido.")
  private String destination;
}
