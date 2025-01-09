package com.evolutio.eiba.common.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.Date;

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
public class AudioRequestDto {

  @NotBlank
  @Size(max = 50)
  @Parameter(description = "Identificador de la conversacion del audio.")
  private String conversationId;

  @NotNull
  @Parameter(description = "Indica si se trata de un único audio.")
  private Boolean isSingleAudio;

  @NotBlank
  @Size(max = 10)
  @Parameter(description = "El formato del audio.")
  private String format;

  @NotNull
  @Parameter(description = "Indica si está ofuscado el audio.")
  private Boolean isObfuscated;

  @Parameter(description = "El rate de grabación del audio.")
  private Integer rate;

  @Size(max = 50)
  @Parameter(description = "El codificador del audio.")
  private String codec;

  @Size(max = 256)
  @Parameter(description = "La clave de ofuscación del audio.")
  private String obfuscationKey;

  @NotBlank
  @Size(max = 1024)
  @Parameter(description = "La uri del audio.")
  private String uri;

  @Size(max = 2048)
  @Parameter(description = "La transcripción del audio.")
  private String transcription;

  @Size(max = 1073741824)
  @Parameter(description = "El syncmap del audio.")
  private String syncMap;

  @Parameter(description = "Los canales del audio.")
  private Integer channels;

  @Size(max = 100)
  @Parameter(description = "El hash del audio.")
  private String hashCode;

  @Parameter(description = "Identificador del usuario que borró el audio.")
  private Long deletedBy;

  @Parameter(description = "Fecha y hora en la que se borró el audio.")
  private Date deletedDate;

  @NotBlank
  @Size(max = 10)
  @Parameter(description = "")
  private String source;

  @NotNull
  @Parameter(description = "Tiene audio descargado.")
  private Boolean hasAudio;

  @Parameter(description = "Numero de reintento.")
  private int retryNumber;

  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Parameter(description = "Fecha de ultimo reintento.")
  private LocalDateTime retryDate;

  @Parameter(description = "En proceso de descarga.")
  private Boolean isDownloading;
}
