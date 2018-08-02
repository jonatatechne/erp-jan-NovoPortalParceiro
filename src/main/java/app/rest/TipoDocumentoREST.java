package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de TipoDocumento
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/TipoDocumento")
public class TipoDocumentoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TipoDocumentoBusiness")
  private TipoDocumentoBusiness tipoDocumentoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public TipoDocumento post(@Validated @RequestBody final TipoDocumento entity) throws Exception {
    return tipoDocumentoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public TipoDocumento put(@Validated @RequestBody final TipoDocumento entity) throws Exception {
    return tipoDocumentoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{tipoDocumentoId}")
  public TipoDocumento put(@Validated @RequestBody final TipoDocumento entity, @PathVariable("tipoDocumentoId") java.lang.String tipoDocumentoId) throws Exception {
    return tipoDocumentoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{tipoDocumentoId}")
  public void delete(@PathVariable("tipoDocumentoId") java.lang.String tipoDocumentoId) throws Exception {
    tipoDocumentoBusiness.delete(tipoDocumentoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<TipoDocumento>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(tipoDocumentoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{tipoDocumentoId}")
  public TipoDocumento get(@PathVariable("tipoDocumentoId") java.lang.String tipoDocumentoId) throws Exception {
    return tipoDocumentoBusiness.get(tipoDocumentoId);
  }
}
