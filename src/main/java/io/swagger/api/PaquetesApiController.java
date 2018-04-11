package io.swagger.api;

import io.swagger.model.Paquete;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-11T21:33:42.076Z")

@Controller
public class PaquetesApiController implements PaquetesApi {

    private static final Logger log = LoggerFactory.getLogger(PaquetesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaquetesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> actualizarPaquete(@ApiParam(value = "id del paquete a actualizar",required=true) @PathVariable("idPaquete") String idPaquete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("\"{}\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> adicionarServicioEnPaquete(@ApiParam(value = "Identificación del paquete al que se le desea agregar el servicio.",required=true) @PathVariable("idPaquete") String idPaquete,@ApiParam(value = "Identificación del servicio que se desea agregar.",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Paquete>> buscarPaquete(@ApiParam(value = "pass an optional search string for looking up inventory") @Valid @RequestParam(value = "searchString", required = false) String searchString) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Paquete>>(objectMapper.readValue("[ {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"precio\" : 35000,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"nombre\" : \"Bronze\"}, {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"precio\" : 35000,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"nombre\" : \"Bronze\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Paquete>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Paquete>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Paquete>> buscarPaquetePorId(@ApiParam(value = "pass an optional search string for looking up inventory",required=true) @PathVariable("idPaquete") String idPaquete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Paquete>>(objectMapper.readValue("[ {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"precio\" : 35000,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"nombre\" : \"Bronze\"}, {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"precio\" : 35000,  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"nombre\" : \"Bronze\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Paquete>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Paquete>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> buscarServicioPaquete(@ApiParam(value = "Identificación del paquete al que se le desea agregar el servicio.",required=true) @PathVariable("idPaquete") String idPaquete) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> crearPaquete(@ApiParam(value = "El paquete a crear"  )  @Valid @RequestBody Paquete paquete) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePaquete(@ApiParam(value = "Id del paquete a eliminar",required=true) @PathVariable("idPaquete") Long idPaquete) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServicioDePaquete(@ApiParam(value = "Identificación del paquete al que se le desea agregar el servicio.",required=true) @PathVariable("idPaquete") String idPaquete,@ApiParam(value = "Identificación del servicio que se desea agregar.",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
