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

/** analytic_tableau */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name = "analytic_tableau", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class AnalyticTableau implements Serializable {

  /** */
  private static final long serialVersionUID = 6744676485434901660L;

  /** */
  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @NotBlank
  @Size(max = 250)
  @Column(name = "name_reporting", nullable = false, length = 250)
  private String nameReporting;

  @Column(name = "tenant_id", nullable = false)
  private Integer tenantId;

  @Size(max = 2048)
  @Column(name = "url_reporting", nullable = false, length = 2048)
  private String urlReporting;

  @Size(max = 250)
  @Column(name = "site", nullable = false, length = 250)
  private String site;

  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 50)
  private StatusEnum status;

  @Size(max = 2048)
  @Column(name = "url_check_signin", nullable = false, length = 2048)
  private String urlCheckSignin;

  @Size(max = 256)
  @Column(name = "tableau_client_id", nullable = false, length = 2048)
  private String tableauClientId;

  @Size(max = 256)
  @Column(name = "tableau_secret_id", nullable = false, length = 2048)
  private String tableauSecretId;

  @Size(max = 256)
  @Column(name = "tablea_secret_key", nullable = false, length = 2048)
  private String tableauSecretKey;
}
