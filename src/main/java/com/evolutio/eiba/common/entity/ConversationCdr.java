package com.evolutio.eiba.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.swagger.v3.oas.annotations.Parameter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@Entity
@Table(name = "conversation_cdr", catalog = "eiba")
public class ConversationCdr extends DataGobernance implements Serializable {

  /** */
  private static final long serialVersionUID = 4049864936207518294L;

  @Id
  @Column(name = "id", unique = true, nullable = false)
  private String id;

  @NotNull
  @Min(value = 1)
  @Column(name = "service_id", nullable = false)
  private Integer serviceId;
  
  @NotNull
  @Min(value = 1)
  @Column(name = "tenant_id", nullable = false)
  private Integer tenantId;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Column(name = "start_date", nullable = false, length = 19)
  private LocalDateTime startDate;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Column(name = "end_date", length = 19)
  private LocalDateTime endDate;

  @NotNull
  @Column(name = "duration", nullable = false)
  private Integer duration;

  @NotNull
  @Size(max = 50)
  @Column(name = "channel", nullable = false, length = 50)
  private String channel;

  @NotNull
  @Size(max = 5)
  @Column(name = "language", nullable = false, length = 5)
  private String language;

  @Size(max = 100)
  @Column(name = "ani", length = 100)
  private String ani;

  @Size(max = 100)
  @Column(name = "dnis", length = 100)
  private String dnis;

  @Column(name = "has_full_audio")
  private Boolean hasFullAudio;

  @Column(name = "has_audios_per_recognition")
  private Boolean hasAudiosPerRecognition;

  @Column(name = "block_amount")
  private Integer blockAmount;

  @Column(name = "interaction_block_amount")
  private Integer interactionBlockAmount;

  @Column(name = "conversation_tag_id")
  private Integer conversationTagId;

  @Column(name = "backend_lookup_block_amount")
  private Integer backendLookupBlockAmount;

  @Column(name = "abandoned")
  private Boolean abandonedCall;

  @Size(max = 50)
  @Column(name = "etl_status", length = 50)
  private String etlStatus;

  @Size(max = 100)
  @Column(name = "etl_status_detail", length = 100)
  private String etlStatusDetail;

  @Column(name = "queue", length = 100)
  private String queue;

  @Size(max = 100)
  @Column(name = "last_tag", length = 100)
  private String lastTag;

  @Size(max = 100)
  @Column(name = "destination", length = 64)
  private String destination;
  
  @Column(name = "tmo_from_start")
  private BigDecimal tmoFromStart;
  
  @Column(name = "tmo_bot")
  private BigDecimal tmoBot;
  
}
