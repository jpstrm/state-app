package br.com.state.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author João Paulo Santarém
 */
public class StateDto implements Serializable {

  private static final long serialVersionUID = -3378095194869217644L;

  @ApiModelProperty(value = "State id", example = "1")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long id;

  @ApiModelProperty(value = "State name", example = "Rio Grande do Sul")
  @NotBlank
  private String name;

  @ApiModelProperty(value = "State code", example = "RS")
  @NotBlank
  private String code;

  @ApiModelProperty(value = "Flag url", example = "http://localhost/img.jpg")
  @NotBlank
  private String flagUrl;

  @ApiModelProperty(value = "Population", example = "3000000")
  @NotNull
  private Long population;

  @ApiModelProperty(value = "Population cost", example = "5.000000")
  private BigDecimal populationCost;

  public StateDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getFlagUrl() {
    return flagUrl;
  }

  public void setFlagUrl(String flagUrl) {
    this.flagUrl = flagUrl;
  }

  public Long getPopulation() {
    return population;
  }

  public void setPopulation(Long population) {
    this.population = population;
  }

  public BigDecimal getPopulationCost() {
    return populationCost;
  }

  public void setPopulationCost(BigDecimal populationCost) {
    this.populationCost = populationCost;
  }

  @Override
  public String toString() {
    return "{\"StateDto\":{"
        + "\"id\":\"" + id + "\""
        + ", \"name\":\"" + name + "\""
        + ", \"code\":\"" + code + "\""
        + ", \"flagUrl\":\"" + flagUrl + "\""
        + ", \"population\":\"" + population + "\""
        + ", \"populationCost\":\"" + populationCost + "\""
        + "}}";
  }

}
