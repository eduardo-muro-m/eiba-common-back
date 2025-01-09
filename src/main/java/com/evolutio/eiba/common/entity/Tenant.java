package com.evolutio.eiba.common.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** Tenant */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tenant", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class Tenant implements Serializable {

  /** */
  private static final long serialVersionUID = -6745279643611356513L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @NotBlank
  @Size(max = 100)
  @Column(name = "name", nullable = false, length = 100)
  private String name;

  @Size(max = 1024)
  @Column(name = "description", length = 1024)
  private String description;

  @NotNull
  @Column(name = "status", nullable = false, length = 50)
  @Enumerated(EnumType.STRING)
  private StatusEnum status;

  @NotNull
  @Column(name = "maxSessions", nullable = false)
  private Integer maxSessions;
}
