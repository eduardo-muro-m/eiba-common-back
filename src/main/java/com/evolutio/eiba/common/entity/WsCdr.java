package com.evolutio.eiba.common.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/** WsCdr */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "ws_cdr", catalog = "eiba")
public class WsCdr implements Serializable {

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

  @NotNull
  @Size(max = 500)
  @Column(name = "ws_result", nullable = false, length = 20)
  private String http_result;

  @Column(name = "ws_http_code")
  private Integer http_code;

  @Column(name = "ws_latency")
  private Integer latency;

  @NotNull
  @DateTimeFormat(iso = ISO.DATE_TIME)
  @Column(name = "exec_datetime", nullable = false, length = 19)
  private LocalDateTime exec_datetime;

  @Size(max = 100)
  @Column(name = "endpoint", length = 100)
  private String endpoint;
}
