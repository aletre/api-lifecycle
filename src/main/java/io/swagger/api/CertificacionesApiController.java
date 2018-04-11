package io.swagger.api;

import io.swagger.model.Certificacion;
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
public class CertificacionesApiController implements CertificacionesApi {

    private static final Logger log = LoggerFactory.getLogger(CertificacionesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CertificacionesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> actualizarCertificacionPorId(@ApiParam(value = "ID de la Certificación a editar",required=true) @PathVariable("idCertificacion") String idCertificacion) {
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

    public ResponseEntity<Void> crearCertificacion(@ApiParam(value = "Objeto Certificacion" ,required=true )  @Valid @RequestBody Certificacion certificacion) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCertificacionPorId(@ApiParam(value = "ID de la Certificación a eliminar",required=true) @PathVariable("idCertificacion") String idCertificacion) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Certificacion>> listarCertificaciones(@ApiParam(value = "Texto para filtrar por nombres de Certificaciones") @Valid @RequestParam(value = "q", required = false) String q) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Certificacion>>(objectMapper.readValue("[ {  \"date\" : \"12/05/1988\",  \"name\" : \"Oscar\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"date\" : \"12/05/1988\",  \"name\" : \"Oscar\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Certificacion>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Certificacion>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> obtenerCertificacionPorId(@ApiParam(value = "ID de la Certificación a buscar",required=true) @PathVariable("idCertificacion") String idCertificacion) {
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
