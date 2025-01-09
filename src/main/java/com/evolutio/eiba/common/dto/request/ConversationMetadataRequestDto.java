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
    title = "ConversationMetadataRequestDto",
    description = "DTO de entrada del metadata de una conversación.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversationMetadataRequestDto {

  @NotBlank
  @Size(max = 50)
  @Parameter(description = "Identificador de la conversacion.")
  private String conversationId;

  @NotNull
  @Parameter(description = "Los metadatos.")
  private String metadata;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "El identificador del servicio.")
  private Integer serviceId;

  @NotNull
  @Min(value = 1)
  @Parameter(description = "El identificador de la compañía.")
  private Integer companyId;
}
