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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** ViewUserCompany */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@Entity
@Table(name = "vuser_company", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewUserCompany extends ViewDataGobernance implements Serializable {

  private static final long serialVersionUID = -4953662412790112063L;

  @Id
  @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
  private Integer id;

  @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
  private Integer userId;

  @Column(name = "user_name", nullable = false, length = 100, insertable = false, updatable = false)
  private String userName;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", length = 50, insertable = false, updatable = false)
  private StatusEnum status;
  
  @Column(name = "default_role_id", nullable = false, insertable = false, updatable = false)
  private Integer defaultRoleId;
  
  @Column(name = "email", nullable = false, length = 100, insertable = false, updatable = false)
  private String email;
  
  @Column(name = "name_role", nullable = false, length = 100, insertable = false, updatable = false)
  private String roleName;
}
