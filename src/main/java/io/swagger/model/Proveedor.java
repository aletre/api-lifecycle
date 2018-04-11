package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Servicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Proveedor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-11T21:33:42.076Z")

public class Proveedor   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("telefono")
  private String telefono = null;

  @JsonProperty("servicios")
  @Valid
  private List<Servicio> servicios = null;

  public Proveedor id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "619619", required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Proveedor nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "Flores", required = true, value = "")
  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Proveedor telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

   /**
   * Get telefono
   * @return telefono
  **/
  @ApiModelProperty(example = "310-322 54 41", required = true, value = "")
  @NotNull


  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Proveedor servicios(List<Servicio> servicios) {
    this.servicios = servicios;
    return this;
  }

  public Proveedor addServiciosItem(Servicio serviciosItem) {
    if (this.servicios == null) {
      this.servicios = new ArrayList<Servicio>();
    }
    this.servicios.add(serviciosItem);
    return this;
  }

   /**
   * Get servicios
   * @return servicios
  **/
  @ApiModelProperty(value = "")

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
    Proveedor proveedor = (Proveedor) o;
    return Objects.equals(this.id, proveedor.id) &&
        Objects.equals(this.nombre, proveedor.nombre) &&
        Objects.equals(this.telefono, proveedor.telefono) &&
        Objects.equals(this.servicios, proveedor.servicios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, telefono, servicios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Proveedor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
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

