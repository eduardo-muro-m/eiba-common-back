package com.evolutio.eiba.common.entity;

import static javax.persistence.GenerationType.IDENTITY;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** RoleSaml */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "role_saml", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class RoleSamL implements Serializable {

  private static final long serialVersionUID = 6483171916511946043L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "role_saml_name", nullable = false, length = 100)
  private String roleSamlName;

  @Column(name = "role_eiba_id")
  private Integer roleEibaId;

  @Column(name = "tenant_id")
  private Integer tenantId;

  @Enumerated(EnumType.STRING)
  @Column(name = "role_eiba_status", nullable = false, length = 50)
  private StatusEnum roleEibaStatus;

  @Column(name = "user_default_language", length = 5)
  private String userDefaultLanguage;

  @Column(name = "user_default_company")
  private Integer userDefaultCompany;

  @Enumerated(EnumType.STRING)
  @Column(name = "user_status", nullable = false, length = 50)
  private StatusEnum userStatus;

  @Column(name = "coments", length = 300)
  private String coments;

  @Column(name = "time_zone", length = 50)
  private String timeZone;
}
