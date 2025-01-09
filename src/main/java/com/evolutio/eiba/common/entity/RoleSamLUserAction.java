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
import javax.validation.constraints.Size;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** role_saml_user_action */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "role_saml_user_action", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class RoleSamLUserAction implements Serializable {

  /** */
  private static final long serialVersionUID = -5258829816911647593L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "id_role_saml", nullable = false, length = 100)
  private Integer idRoleSaml;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 50)
  private StatusEnum status;

  @NotBlank
  @Size(max = 100)
  @Column(name = "action", nullable = false, length = 100)
  private String action;

  @NotBlank
  @Size(max = 250)
  @Column(name = "url", nullable = false, length = 250)
  private String url;
}
