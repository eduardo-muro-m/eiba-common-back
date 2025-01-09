package com.evolutio.eiba.common.entity.view;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** ViewCompany */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
@Builder
@Entity
@Table(name = "vcompany", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewCompany implements Serializable {

  private static final long serialVersionUID = 3603758268388174809L;

  @Id
  @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
  private Integer id;

  @Column(name = "name", nullable = false, length = 100, insertable = false, updatable = false)
  private String name;

  @Column(name = "description", length = 1024, insertable = false, updatable = false)
  private String description;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", length = 50, nullable = false, insertable = false, updatable = false)
  private StatusEnum status;

  @Column(name = "tenant_id", nullable = false, insertable = false, updatable = false)
  private Integer tenantId;

  @Column(
      name = "default_language",
      nullable = false,
      length = 5,
      insertable = false,
      updatable = false)
  private String defaultLanguage;

  @Column(
      name = "tenant_name",
      nullable = false,
      length = 100,
      insertable = false,
      updatable = false)
  private String tenantName;
}
