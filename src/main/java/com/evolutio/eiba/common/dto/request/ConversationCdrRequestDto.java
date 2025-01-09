package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
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
public class ConversationCdrRequestDto {

  @NotBlank
  @Size(max = 50)
  @Parameter(description = "El identificador de la conersación.")
  private String id;

  @NotNull
  @Parameter(description = "El identificador de la compañía.")
  private Integer companyId;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "El identificador del servicio.")
  private Integer serviceId;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "Fecha de inicio de la conversación.")
  private LocalDateTime startDate;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "Fecha fin de la conversación.")
  private LocalDateTime endDate;

  @NotNull
  @Parameter(description = "Duración de la conversación.")
  private Integer duration;

  @NotNull
  @Size(max = 50)
  @Parameter(description = "Canal de la conversación.")
  private String channel;

  @NotNull
  @Size(max = 5)
  @Parameter(description = "Lenguaje de la conversación.")
  private String language;

  @Size(max = 100)
  @Parameter(description = "ANI de la conversación.")
  private String ani;

  @Size(max = 100)
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

  @Size(max = 50)
  @Parameter(description = "Estado del ETL.")
  private String etlStatus;

  @Size(max = 100)
  @Parameter(description = "Detalle del estado del ETL.")
  private String etlStatusDetail;

  @Parameter(description = "Indica si la llamada ha sido abandonada")
  private Boolean abandonedCall;

  @Size(max = 100)
  @Parameter(description = "Nombre de la cola destino de la conversacion")
  private String queue;

  @Size(max = 100)
  @Parameter(description = "Ultima etiqueta de la conversacion")
  private String lastTag;

  @Size(max = 64)
  @Parameter(description = "Destino de la conversacion")
  private String destination;
  
  @Parameter(description = "Tiempo en segundos para la primera fecha de bloque para KPI de TMO.")
  private BigDecimal tmoFromStart;
  
  @Parameter(description = "Tiempo en segundos para la última fecha de bloque para KPI de TMO.")
  private BigDecimal tmoBot;
}
