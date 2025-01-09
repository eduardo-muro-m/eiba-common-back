package com.evolutio.eiba.common.entity.view;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** ViewMenu */

/** vmenu_url_endpoint */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name = "vmenu_url_endpoint", catalog = "eiba")
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class ViewMenuUrlEndpoint implements Serializable {

  /** */
  private static final long serialVersionUID = -133431053845098372L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "tenant_id", nullable = false, insertable = false, updatable = false)
  private Integer tenantId;

  @Column(name = "menu_url_id", nullable = false, insertable = false, updatable = false)
  private Integer menuUrlId;

  @Column(name = "menu_url", nullable = false, insertable = false, updatable = false)
  private String menuUrl;

  @Column(name = "ws_uri", nullable = false, insertable = false, updatable = false)
  private String wsUri;

  @Column(name = "ws_method", nullable = false)
  private String wsMethod;

  @Column(name = "check_user_actions", nullable = false)
  private String checkUserActions;
}
