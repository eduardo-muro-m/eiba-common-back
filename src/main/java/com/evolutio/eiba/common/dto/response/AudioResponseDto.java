package com.evolutio.eiba.common.dto.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Schema(title = "AudioResponseDto",
    description = "DTO de respuesta de un objeto audio con bloques.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true, value = {"hibernateLazyInitializer", "handler"})
public class AudioResponseDto {

  @Parameter(description = "Identificador del audio.")
  private Long id;

  @Parameter(description = "Identificador de la conversacion del audio.")
  private String conversationId;

  @Parameter(description = "Indica si se trata de un único audio.")
  private boolean isSingleAudio;

  @Parameter(description = "El formato del audio.")
  private String format;

  @Parameter(description = "Indica si está ofuscado el audio.")
  private boolean isObfuscated;

  @Parameter(description = "El rate de grabación del audio.")
  private Integer rate;

  @Parameter(description = "El codificador del audio.")
  private String codec;

  @Parameter(description = "La clave de ofuscación del audio.")
  private String obfuscationKey;

  @Parameter(description = "La uri del audio.")
  private String uri;

  @Parameter(description = "La transcripción del audio.")
  private String transcription;

  @Parameter(description = "El syncmap del audio.")
  private String syncMap;

  @Parameter(description = "Los canales del audio.")
  private Integer channels;

  @Parameter(description = "")
  private String hashCode;
  
  @Parameter(description = "Identificador del usuario que borró el audio.")
  private Long deletedBy;

  @Parameter(description = "Fecha y hora en la que se borró el audio.")
  private Date deletedDate;
  
  @Parameter(description = "")
  private String source;
  
}
