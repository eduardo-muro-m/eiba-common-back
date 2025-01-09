package com.evolutio.eiba.common.dto.request;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entrada DTO de una conversación.
 *
 * @author Evolutio
 */
@Schema(title = "ConversationGeneralRequestDto", description = "DTO de entrada de una conversación.")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversationGeneralRequestDto {

	private ConversationCdrRequestDto conversationCdr;
	
	private ConversationMetadataRequestDto conversationMetadata;
	
	private AudioRequestDto audioRequestDto;
 
}
