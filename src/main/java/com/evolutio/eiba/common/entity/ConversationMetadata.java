package com.evolutio.eiba.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "conversation_metadata", catalog = "eiba")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversationMetadata implements Serializable {

  private static final long serialVersionUID = 940261834025428532L;

  @Id
  @NotBlank
  @Size(max = 50)
  @Column(name = "conversation_id", unique = true, nullable = false, length = 50)
  private String conversationId;

  @NotBlank
  @Column(name = "metadata", nullable = false)
  private String metadata;
}
