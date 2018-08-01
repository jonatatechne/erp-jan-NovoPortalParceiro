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
 * Controller para expor serviços REST de ScanDocumento
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/ScanDocumento")
public class ScanDocumentoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ScanDocumentoBusiness")
  private ScanDocumentoBusiness scanDocumentoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public ScanDocumento post(@Validated @RequestBody final ScanDocumento entity) throws Exception {
    return scanDocumentoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public ScanDocumento put(@Validated @RequestBody final ScanDocumento entity) throws Exception {
    return scanDocumentoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{scanDocumentoId}")
  public ScanDocumento put(@Validated @RequestBody final ScanDocumento entity, @PathVariable("scanDocumentoId") java.lang.String scanDocumentoId) throws Exception {
    return scanDocumentoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{scanDocumentoId}")
  public void delete(@PathVariable("scanDocumentoId") java.lang.String scanDocumentoId) throws Exception {
    scanDocumentoBusiness.delete(scanDocumentoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<ScanDocumento>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(scanDocumentoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{scanDocumentoId}")
  public ScanDocumento get(@PathVariable("scanDocumentoId") java.lang.String scanDocumentoId) throws Exception {
    return scanDocumentoBusiness.get(scanDocumentoId);
  }

  /**
   * Foreign Key parceiro
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Parceiro/{parceiroId}")    
  public HttpEntity<PagedResources<ScanDocumento>> findScanDocumentosByParceiro(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(scanDocumentoBusiness.findScanDocumentosByParceiro(parceiroId, pageable)), HttpStatus.OK);
  }
}
