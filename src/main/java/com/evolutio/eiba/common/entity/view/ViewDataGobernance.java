package com.evolutio.eiba.common.entity.view;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class ViewDataGobernance {

  @Column(name = "company_id", nullable = false, insertable = false, updatable = false)
  private Integer companyId;

  @Column(
      name = "company_name",
      nullable = false,
      length = 100,
      insertable = false,
      updatable = false)
  private String companyName;

  @Column(name = "tenant_id", nullable = false, insertable = false, updatable = false)
  private int tenantId;

  @Column(
      name = "tenant_name",
      nullable = false,
      length = 100,
      insertable = false,
      updatable = false)
  private String tenantName;
}
