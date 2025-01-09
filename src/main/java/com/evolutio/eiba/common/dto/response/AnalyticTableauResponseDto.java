package com.evolutio.eiba.common.dto.response;

import com.evolutio.eiba.common.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Schema(
    title = "AnalyticTableauResponseDto",
    description =
        "DTO de respuesta de un proceso de obtencion de informacion de informes de analitica de Tableau.")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(
    ignoreUnknown = true,
    value = {"hibernateLazyInitializer", "handler"})
public class AnalyticTableauResponseDto {

  @Parameter(description = "Identificador del informe.")
  private Integer id;

  @Parameter(description = "Nombre del informe de analítica de Tableau.")
  private String nameReporting;

  @Parameter(description = "Identificador del tenant.")
  private Integer tenantId;

  @Parameter(description = "URL de Tableau del informe.")
  private String urlReporting;

  @Parameter(description = "Site de tableu.")
  private String site;

  @Parameter(description = "Estado del informe.")
  private StatusEnum status;

  @Parameter(description = "Url de Tableau para comprobar que el usuario existe.")
  private String urlCheckSignin;

  @Parameter(description = "Client Id de tableau para la conexion con Tableau.")
  private String tableauClientId;

  @Parameter(description = "Secret Id de tableau para la conexion con Tableau.")
  private String tableauSecretId;

  @Parameter(description = "Secret Key de tableau para la conexion con Tableau.")
  private String tableauSecretKey;
}
