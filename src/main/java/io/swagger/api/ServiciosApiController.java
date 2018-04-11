package io.swagger.api;

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
public class ServiciosApiController implements ServiciosApi {

    private static final Logger log = LoggerFactory.getLogger(ServiciosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiciosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> actualizarServicio(@ApiParam(value = "Servicio buscado",required=true) @PathVariable("idServicio") String idServicio) {
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

    public ResponseEntity<List<Servicio>> buscarServicio(@ApiParam(value = "id del servicio que se desea buscar",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Servicio>>(objectMapper.readValue("[ {  \"precio\" : 2000,  \"name\" : \"Flores\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"precio\" : 2000,  \"name\" : \"Flores\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Servicio>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Servicio>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Servicio>> buscarServicioPorId(@ApiParam(value = "id del servicio que se desea buscar",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Servicio>>(objectMapper.readValue("[ {  \"precio\" : 2000,  \"name\" : \"Flores\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"precio\" : 2000,  \"name\" : \"Flores\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Servicio>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Servicio>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> crearServicio(@ApiParam(value = "Paquete que se busca adicionar" ,required=true )  @Valid @RequestBody Servicio servicio) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServicio(@ApiParam(value = "El Id del servicio a eliminar",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
