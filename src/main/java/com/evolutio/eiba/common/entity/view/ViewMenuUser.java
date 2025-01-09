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

/** ViewMenuUser */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name = "vmenu_user", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewMenuUser implements Serializable {

  /** */
  private static final long serialVersionUID = -3880844831803834743L;

  @Id
  @Column(name = "id", length = 36, nullable = false, insertable = false, updatable = false)
  private String id;

  @Column(name = "menu_id", nullable = false, insertable = false, updatable = false)
  private Integer menuId;

  @Column(name = "parent_id", insertable = false, updatable = false)
  private Integer parentId;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false, length = 50, insertable = false, updatable = false)
  private StatusEnum status;

  @Column(name = "url", length = 250, insertable = false, updatable = false)
  private String url;

  @Column(name = "menu_order", insertable = false, updatable = false)
  private Integer menuOrder;

  @Column(name = "icon", length = 100, insertable = false, updatable = false)
  private String icon;

  @Column(name = "frontend_literals_label_id", length = 100, insertable = false, updatable = false)
  private String frontendLiteralsLabelId;

  @Column(name = "label", length = 250, nullable = false, insertable = false, updatable = false)
  private String label;

  @Column(name = "role_id", nullable = false, insertable = false, updatable = false)
  private Integer roleId;

  @Column(name = "role_name", length = 100, nullable = false, insertable = false, updatable = false)
  private String roleName;

  @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
  private Integer userId;

  @Column(name = "user_name", length = 100, nullable = false, insertable = false, updatable = false)
  private String userName;

  @Column(name = "tenant_id", nullable = false, insertable = false, updatable = false)
  private Integer tenantId;

  @Column(
      name = "tenant_name",
      length = 100,
      nullable = false,
      insertable = false,
      updatable = false)
  private String tenantName;
}
