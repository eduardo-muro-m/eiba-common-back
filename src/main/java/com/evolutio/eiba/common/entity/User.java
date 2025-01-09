package com.evolutio.eiba.common.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** User */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "user", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class User implements Serializable {

  private static final long serialVersionUID = 6483171916511946043L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "name", nullable = false, length = 100)
  private String name;

  @Column(name = "email", nullable = false, length = 100)
  private String email;

  @Column(name = "password", length = 100)
  private String password;

  @Column(name = "must_change_password", nullable = false)
  private boolean mustChangePassword;

  @Column(name = "default_role_id")
  private Integer defaultRoleId;

  @Column(name = "default_company_id")
  private Integer defaultCompanyId;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 50)
  private StatusEnum status;

  @Column(name = "tenant_id")
  private Integer tenantId;

  @Column(name = "surname1", length = 100)
  private String surname1;

  @Column(name = "surname2", length = 100)
  private String surname2;

  @Column(name = "default_language", length = 5)
  private String defaultLanguage;

  @Column(name = "is_auth_saml")
  private Boolean isAuthSaml;

  @Column(name = "time_zone")
  private String timeZone;

  @Column(name = "fx_last_change_password", nullable = false)
  private LocalDateTime fxLastChangePassword;

  @Column(name = "login_attempts", nullable = false)
  private Integer loginAttempts;

  @Column(name = "check_access")
  private Boolean checkAccess;
}
