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
 * Controller para expor serviços REST de Observacoes
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Observacoes")
public class ObservacoesREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ObservacoesBusiness")
  private ObservacoesBusiness observacoesBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Observacoes post(@Validated @RequestBody final Observacoes entity) throws Exception {
    return observacoesBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Observacoes put(@Validated @RequestBody final Observacoes entity) throws Exception {
    return observacoesBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{observacoesId}")
  public Observacoes put(@Validated @RequestBody final Observacoes entity, @PathVariable("observacoesId") java.lang.String observacoesId) throws Exception {
    return observacoesBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{observacoesId}")
  public void delete(@PathVariable("observacoesId") java.lang.String observacoesId) throws Exception {
    observacoesBusiness.delete(observacoesId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Observacoes>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(observacoesBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{observacoesId}")
  public Observacoes get(@PathVariable("observacoesId") java.lang.String observacoesId) throws Exception {
    return observacoesBusiness.get(observacoesId);
  }

  /**
   * Foreign Key oportunidade
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Oportunidade/{oportunidadeId}")    
  public HttpEntity<PagedResources<Observacoes>> findObservacoessByOportunidade(@PathVariable("oportunidadeId") java.lang.String oportunidadeId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(observacoesBusiness.findObservacoessByOportunidade(oportunidadeId, pageable)), HttpStatus.OK);
  }
}
