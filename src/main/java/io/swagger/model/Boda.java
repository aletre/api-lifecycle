package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Servicio;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Boda
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-11T21:33:42.076Z")

public class Boda   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("servicios")
  @Valid
  private List<Servicio> servicios = new ArrayList<Servicio>();

  @JsonProperty("paquete")
  private Object paquete = null;

  public Boda id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Boda servicios(List<Servicio> servicios) {
    this.servicios = servicios;
    return this;
  }

  public Boda addServiciosItem(Servicio serviciosItem) {
    this.servicios.add(serviciosItem);
    return this;
  }

   /**
   * Get servicios
   * @return servicios
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Servicio> getServicios() {
    return servicios;
  }

  public void setServicios(List<Servicio> servicios) {
    this.servicios = servicios;
  }

  public Boda paquete(Object paquete) {
    this.paquete = paquete;
    return this;
  }

   /**
   * Get paquete
   * @return paquete
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getPaquete() {
    return paquete;
  }

  public void setPaquete(Object paquete) {
    this.paquete = paquete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boda boda = (Boda) o;
    return Objects.equals(this.id, boda.id) &&
        Objects.equals(this.servicios, boda.servicios) &&
        Objects.equals(this.paquete, boda.paquete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, servicios, paquete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    servicios: ").append(toIndentedString(servicios)).append("\n");
    sb.append("    paquete: ").append(toIndentedString(paquete)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

