package io.swagger.api;

import io.swagger.model.Boda;
import io.swagger.model.Servicio;
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
public class BodasApiController implements BodasApi {

    private static final Logger log = LoggerFactory.getLogger(BodasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BodasApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> actualizarBoda(@ApiParam(value = "id de la boda a actualizar",required=true) @PathVariable("idBoda") String idBoda,@ApiParam(value = "servicios a añadir" ,required=true )  @Valid @RequestBody Servicio servicesToUpdate) {
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

    public ResponseEntity<List<Boda>> buscarBoda(@ApiParam(value = "filtro a aplicar para buscar bodas específicas") @Valid @RequestParam(value = "filtroBodas", required = false) String filtroBodas) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Boda>>(objectMapper.readValue("[ {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"paquete\" : \"{}\"}, {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"paquete\" : \"{}\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Boda>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Boda>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> crearBoda(@ApiParam(value = "Objeto Boda" ,required=true )  @Valid @RequestBody Boda boda) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteBoda(@ApiParam(value = "Id de la boda a eliminar",required=true) @PathVariable("idBoda") String idBoda) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> obtenerBoda(@ApiParam(value = "id de la boda a actualizar",required=true) @PathVariable("idBoda") String idBoda) {
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

}
