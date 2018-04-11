/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Servicio;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-11T21:33:42.076Z")

@Api(value = "servicios", description = "the servicios API")
public interface ServiciosApi {

    @ApiOperation(value = "Actualiza un servicio dado su id", nickname = "actualizarServicio", notes = "Actualiza un servicio dado su id", response = Object.class, tags={ "servicios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Servicio actualizado correctamente", response = Object.class) })
    @RequestMapping(value = "/servicios/{idServicio}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Object> actualizarServicio(@ApiParam(value = "Servicio buscado",required=true) @PathVariable("idServicio") String idServicio);


    @ApiOperation(value = "Lista de servicios disponibles", nickname = "buscarServicio", notes = "servicios disponibles en paquetes disponibles en venta", response = Servicio.class, responseContainer = "List", tags={ "servicios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operacion correcta", response = Servicio.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/servicios",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Servicio>> buscarServicio(@ApiParam(value = "id del servicio que se desea buscar",required=true) @PathVariable("idServicio") String idServicio);


    @ApiOperation(value = "Lista de servicios disponibles", nickname = "buscarServicioPorId", notes = "servicios disponibles en paquetes disponibles en venta", response = Servicio.class, responseContainer = "List", tags={ "servicios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operacion correcta", response = Servicio.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/servicios/{idServicio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Servicio>> buscarServicioPorId(@ApiParam(value = "id del servicio que se desea buscar",required=true) @PathVariable("idServicio") String idServicio);


    @ApiOperation(value = "Adiciona un nuevo servicio", nickname = "crearServicio", notes = "Crea un nuevo servicio", tags={ "servicios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/servicios",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> crearServicio(@ApiParam(value = "Paquete que se busca adicionar" ,required=true )  @Valid @RequestBody Servicio servicio);


    @ApiOperation(value = "Elimina un servicio", nickname = "deleteServicio", notes = "Elimina un servicio", tags={ "servicios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Servicio invalido"),
        @ApiResponse(code = 404, message = "Servicio no encontrado") })
    @RequestMapping(value = "/servicios/{idServicio}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteServicio(@ApiParam(value = "El Id del servicio a eliminar",required=true) @PathVariable("idServicio") String idServicio);

}
