package com.evolutio.eiba.common.entity.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

/** ViewUserAction */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name = "vuser_action", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewUserAction implements Serializable {

  private static final long serialVersionUID = 7822258177934450846L;

  @Id
  @Column(name = "id", length = 36, nullable = false, insertable = false, updatable = false)
  private Integer id;

  @Column(name = "action", nullable = false, length = 100, insertable = false, updatable = false)
  private String action;

  @Column(name = "url", nullable = false, length = 250, insertable = false, updatable = false)
  private String url;

  @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
  private Integer userId;

  @Column(name = "user_name", length = 100, nullable = false, insertable = false, updatable = false)
  private String userName;

  @Column(name = "tenant_id", nullable = false, insertable = false, updatable = false)
  private Integer tenantId;

  @Column(
      name = "tenant_name",
      nullable = false,
      length = 100,
      insertable = false,
      updatable = false)
  private String tenantName;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 100, insertable = false, updatable = false)
  private StatusEnum status;
}
