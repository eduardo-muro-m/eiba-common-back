package com.evolutio.eiba.common.dto.response;

import com.evolutio.eiba.common.dto.response.view.ViewDataGobernanceResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Schema(
    title = "ConversationCdrResponseDto",
    description = "DTO de respuesta de un objeto conversacion.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ConversationCdrResponseDto extends ViewDataGobernanceResponseDto {

  @Parameter(description = "Identificador del objeto.")
  private String id;

  @Parameter(description = "Identificador del servicio.")
  private Integer serviceId;

  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "Fecha de inicio de la conversación.")
  private LocalDateTime startDate;

  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "Fecha fin de la conversación.")
  private LocalDateTime endDate;

  @Parameter(description = "Duración de la conversación.")
  private Integer duration;

  @Parameter(description = "Canal de la conversación.")
  private String channel;

  @Parameter(description = "Lenguaje de la conversación.")
  private String language;

  @Parameter(description = "ANI de la conversación.")
  private String ani;

  @Parameter(description = "DNIS de la conversación.")
  private String dnis;

  @Parameter(description = "Indica si tiene el audio completo.")
  private Boolean hasFullAudio;

  @Parameter(description = "Indica si tiene audios por reconocimiento.")
  private Boolean hasAudiosPerRecognition;

  @Parameter(description = "Cantidad de bloques.")
  private Integer blockAmount;

  @Parameter(description = "Cantidad de bloques con interacción.")
  private Integer interactionBlockAmount;

  @Parameter(description = "Identificador de la etiqueta de la conversación.")
  private Integer conversationTagId;

  @Parameter(description = "Cantidad de bloques de búsqueda.")
  private Integer backendLookupBlockAmount;

  @Parameter(description = "Estado del ETL.")
  private String etlStatus;

  @Parameter(description = "Detalle del estado del ETL.")
  private String etlStatusDetail;

  @Parameter(description = "Nombre de la cola destino de la conversacion")
  private String queue;

  @Parameter(description = "Ultima etiqueta de la conversacion")
  private String lastTag;

  @Parameter(description = "Destino de la conversacion")
  private String destination;
}
