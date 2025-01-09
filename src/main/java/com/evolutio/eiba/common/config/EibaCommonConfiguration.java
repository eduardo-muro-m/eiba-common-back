package com.evolutio.eiba.common.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(
    basePackages = {
      "com.evolutio.eiba.common.entity",
      "com.evolutio.eiba.common.entity.view",
      "com.evolutio.eiba.*.entity",
      "com.evolutio.eiba.*.entity.view"
    })
public class EibaCommonConfiguration {}
