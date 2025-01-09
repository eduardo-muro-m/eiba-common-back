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

@Schema(title = "ConversationGeneralResponse", description = "DTO de respuesta de un objeto conversacion General.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer", "handler" })
public class ConversationGeneralResponse {

	@Parameter(description = "Objeto conversation.")
	private ConversationCdrResponseDto conversationCdrResponseDto;

	@Parameter(description = "Objeto Metadata.")
	private ConversationMetadataResponseDto conversationMetadataResponseDto;

	@Parameter(description = "Objeto audio.")
	private AudioResponseDto audioResponseDto;

	
}
