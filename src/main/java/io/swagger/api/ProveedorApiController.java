package io.swagger.api;

import io.swagger.model.Proveedor;
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
public class ProveedorApiController implements ProveedorApi {

    private static final Logger log = LoggerFactory.getLogger(ProveedorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProveedorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> actualizarProveedor(@ApiParam(value = "Proveedor buscado",required=true) @PathVariable("idProveedor") String idProveedor) {
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

    public ResponseEntity<Void> adicionarServicioProveedor(@ApiParam(value = "Identificación del proveedor al que se le desea agregar el servicio.",required=true) @PathVariable("idProveedor") String idProveedor,@ApiParam(value = "Identificación del servicio que se desea agregar.",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Proveedor>> buscarProveedor(@ApiParam(value = "id del proveedor que se desea buscar",required=true) @PathVariable("idProveedor") String idProveedor) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Proveedor>>(objectMapper.readValue("[ {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"id\" : \"619619\",  \"telefono\" : \"310-322 54 41\",  \"nombre\" : \"Flores\"}, {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"id\" : \"619619\",  \"telefono\" : \"310-322 54 41\",  \"nombre\" : \"Flores\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Proveedor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Proveedor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Proveedor>> buscarProveedorPorId(@ApiParam(value = "id del proveedor que se desea buscar",required=true) @PathVariable("idProveedor") String idProveedor) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Proveedor>>(objectMapper.readValue("[ {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"id\" : \"619619\",  \"telefono\" : \"310-322 54 41\",  \"nombre\" : \"Flores\"}, {  \"servicios\" : [ {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  }, {    \"precio\" : 2000,    \"name\" : \"Flores\",    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"  } ],  \"id\" : \"619619\",  \"telefono\" : \"310-322 54 41\",  \"nombre\" : \"Flores\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Proveedor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Proveedor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> buscarServicioProveedor(@ApiParam(value = "Identificación del proveedor al cual se le desean listar sus servicios",required=true) @PathVariable("idProveedor") String idProveedor) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> crearProveedor(@ApiParam(value = "proveedor que se busca adicionar" ,required=true )  @Valid @RequestBody Proveedor proveedor) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProveedor(@ApiParam(value = "El Id del proveedor a eliminar",required=true) @PathVariable("idProveedor") String idProveedor) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServicioDeProveedor(@ApiParam(value = "Identificación del proveedor al que se le desea agregar el servicio.",required=true) @PathVariable("idProveedor") String idProveedor,@ApiParam(value = "Identificación del servicio que se desea agregar.",required=true) @PathVariable("idServicio") String idServicio) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
