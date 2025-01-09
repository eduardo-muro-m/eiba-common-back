package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
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
@Schema(title = "ConversationCdrRequestDto", description = "DTO de entrada de una conversación.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class InteractionCdrRequestDto {

  @NotNull
  @Size(max = 50)
  @Parameter(description = "Identificador de la conversacion de la interacción.")
  private String conversationId;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "La hora y fecha de la interacción.")
  private LocalDateTime datetime;

  @Size(max = 1024)
  @Parameter(description = "Declaración.")
  private String utterance;

  @NotNull
  @Size(max = 20)
  @Parameter(description = "Resultado de la interacción.")
  private String result;

  @Size(max = 100)
  @Parameter(description = "La etiqueta asociada.")
  private String tag;

  @Size(max = 64)
  @Parameter(description = "La intencion obtenida del bot.")
  private String intent;

  @Size(max = 64)
  @Parameter(description = "Nombre de la entidad obtenida del bot.")
  private String entityName;

  @Size(max = 1024)
  @Parameter(description = "Valor de la entidad obtenida del bot.")
  private String entityValue;

  @Parameter(description = "El nivel de confianza de la entidad.")
  private Float entityConfidence;

  @Size(max = 64)
  @Parameter(description = "El destino obtenido.")
  private String destination;

  @NotBlank
  @Size(max = 5)
  @Parameter(description = "Lenguaje de la interacción.")
  private String language;

  @Size(max = 100)
  @Parameter(description = "Tecnología de reconocimiento.")
  private String recognitionTechnology;

  @Parameter(description = "Identificador del audio asociado a la interacción.")
  private Long audioId;

  @Parameter(description = "Identificador del bot asociado a la interacción.")
  private Integer botId;

  @Parameter(description = "Identificador del menú asociado a la interacción.")
  private Integer menuId;

  @Parameter(description = "Identificador gramatical asociado a la interacción.")
  private Integer grammarId;

  @NotBlank
  @Size(max = 1024)
  @Parameter(description = "Respuesta de la interacción.")
  private String response;

  @Size(max = 1024)
  @Parameter(description = "Entidades rellenadas.")
  private String filledEntities;

  @Size(max = 1024)
  @Parameter(description = "Entidades pendientes.")
  private String pendingEntities;

  @Size(max = 1024)
  @Parameter(description = "Contextos actuales.")
  private String currentContexts;

  @NotNull
  @Parameter(description = "Indica si la interacción es de voz.")
  private Boolean isVoice;

  @NotNull
  @Size(max = 20)
  @Parameter(description = "Tipo de interacción de usuario.")
  private String userInteractionType;

  @NotNull
  @Parameter(description = "Número de intentos.")
  private Integer attemptAmount;

  @Size(max = 1024)
  @Parameter(description = "Descripción de intentos.")
  private String attemptsDescription;

  @Min(value = 1)
  @Parameter(description = "Identificador de la auditoría asociada a la interacción.")
  private Integer surveyId;

  @Min(value = 1)
  @Parameter(description = "Identificador de la pregunta de auditoría asociada a la interacción.")
  private Integer surveyQuestionId;

  @Parameter(description = "Indica si es un segmento de audio.")
  private Boolean isAudioASegment;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "Identificador del bloque asociado a la interacción.")
  private Long blockId;

  @Parameter(description = "El nivel de confianza.")
  private Float confidence;

  @NotNull
  @Parameter(description = "Umbral de decisión.")
  private Float decisionThreshold;
}
