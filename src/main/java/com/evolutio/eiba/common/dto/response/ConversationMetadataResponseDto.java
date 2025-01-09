package com.evolutio.eiba.common.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Schema(title = "ConversationMetadataResponseDto",
    description = "DTO de respuesta de un objeto metadata de una conversacion.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true, value = {"hibernateLazyInitializer", "handler"})
public class ConversationMetadataResponseDto {

  @Parameter(description = "Identificador de la conversacion.")
  private String conversationId;

  @Parameter(description = "Los metadatos.")
  private String metadata;
}
