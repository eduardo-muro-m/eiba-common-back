package com.evolutio.eiba.common.entity;

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
public class DataGobernance {

  @Column(name = "tenant_id", nullable = false)
  private Integer tenantId;

  @Column(name = "company_id", nullable = false)
  private Integer companyId;
}
