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
 * Paquete
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-11T21:33:42.076Z")

public class Paquete   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("precio")
  private Integer precio = null;

  @JsonProperty("servicios")
  @Valid
  private List<Servicio> servicios = new ArrayList<Servicio>();

  public Paquete id(UUID id) {
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

  public Paquete nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "Bronze", required = true, value = "")
  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Paquete precio(Integer precio) {
    this.precio = precio;
    return this;
  }

   /**
   * Get precio
   * @return precio
  **/
  @ApiModelProperty(example = "35000", required = true, value = "")
  @NotNull


  public Integer getPrecio() {
    return precio;
  }

  public void setPrecio(Integer precio) {
    this.precio = precio;
  }

  public Paquete servicios(List<Servicio> servicios) {
    this.servicios = servicios;
    return this;
  }

  public Paquete addServiciosItem(Servicio serviciosItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paquete paquete = (Paquete) o;
    return Objects.equals(this.id, paquete.id) &&
        Objects.equals(this.nombre, paquete.nombre) &&
        Objects.equals(this.precio, paquete.precio) &&
        Objects.equals(this.servicios, paquete.servicios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, precio, servicios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paquete {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    servicios: ").append(toIndentedString(servicios)).append("\n");
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

