package com.evolutio.eiba.common.entity.view;

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

/** Vuser */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "vuser", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewUser implements Serializable {

  private static final long serialVersionUID = 6483171916511946043L;

  public static final String TENANT_KEY = "tenantId";
  public static final String COMPANY_KEY = "companyId";
  public static final String USER_ID = "id";

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
  private Integer id;

  @Column(name = "name", nullable = false, length = 100, insertable = false, updatable = false)
  private String name;

  @Column(name = "email", nullable = false, length = 100, insertable = false, updatable = false)
  private String email;

  @Column(name = "password", length = 100, insertable = false, updatable = false)
  private String password;

  @Column(name = "must_change_password", nullable = false, insertable = false, updatable = false)
  private boolean mustChangePassword;

  @Column(name = "default_role_id", insertable = false, updatable = false)
  private Integer defaultRoleId;

  @Column(name = "default_company_id", insertable = false, updatable = false)
  private Integer defaultCompanyId;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 50, insertable = false, updatable = false)
  private StatusEnum status;

  @Column(name = "tenant_id", insertable = false, updatable = false)
  private Integer tenantId;

  @Column(name = "surname1", length = 100, insertable = false, updatable = false)
  private String surname1;

  @Column(name = "surname2", length = 100, insertable = false, updatable = false)
  private String surname2;

  @Column(name = "default_language", length = 5, insertable = false, updatable = false)
  private String defaultLanguage;

  @Column(name = "role_name", length = 100, insertable = false, updatable = false)
  private String roleName;

  @Column(name = "company_name", length = 100, insertable = false, updatable = false)
  private String companyName;

  @Column(name = "tenant_name", length = 100, insertable = false, updatable = false)
  private String tenantName;

  @Column(name = "is_auth_saml", nullable = false, insertable = false, updatable = false)
  private Boolean isAuthSaml;

  @Column(name = "time_zone", nullable = false, insertable = false, updatable = false)
  private String timeZone;

  @Column(name = "fx_last_change_password", nullable = false, insertable = false, updatable = false)
  private LocalDateTime fxLastChangePassword;

  @Column(name = "login_attempts", insertable = false, updatable = false)
  private Integer loginAttempts;

  @Column(name = "check_access", insertable = false, updatable = false)
  private Boolean checkAccess;
}
