package com.evolutio.eiba.common.entity;

import static javax.persistence.GenerationType.IDENTITY;

import io.swagger.v3.oas.annotations.Parameter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** WsCdr */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "prompt_cdr", catalog = "eiba")
public class PromptCdr implements Serializable {

  private static final long serialVersionUID = -644391869544766745L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Long id;

  @NotNull
  @Size(max = 50)
  @Column(name = "conversation_id", nullable = false, length = 50)
  private String conversationId;

  @NotNull
  @Min(value = 1)
  @Column(name = "block_id", nullable = false)
  private Long blockId;

  @Column(name = "audio_id")
  private Long audioId;

  @Size(max = 1024)
  @Column(name = "utterance", length = 1024)
  private String utterance;

  @NotBlank
  @Size(max = 5)
  @Column(name = "language", nullable = false, length = 5)
  private String language;

  @Size(max = 100)
  @Column(name = "recognition_technology", length = 100)
  private String recognitionTechnology;

  @Size(max = 64)
  @Parameter(description = "El destino obtenido.")
  private String destination;
}
