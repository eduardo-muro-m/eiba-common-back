package com.evolutio.eiba.common.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "conversation_metadata_detail", catalog = "eiba")
public class ConversationMetadataDetail implements Serializable {

  private static final long serialVersionUID = -7975785758378474287L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Long id;

  @NotBlank
  @Size(max = 50)
  @Column(name = "conversation_id", nullable = false, length = 50)
  private String conversationId;

  @NotBlank
  @Size(max = 100)
  @Column(name = "name", nullable = false, length = 100)
  private String name;

  @Size(max = 10000)
  @Column(name = "value", nullable = false, length = 10000)
  private String value;
}
