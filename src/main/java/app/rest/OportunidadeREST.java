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
 * Controller para expor serviços REST de Oportunidade
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Oportunidade")
public class OportunidadeREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("OportunidadeBusiness")
  private OportunidadeBusiness oportunidadeBusiness;

  /**
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
  public Oportunidade post(@Validated @RequestBody final Oportunidade entity) throws Exception {
    return oportunidadeBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Oportunidade put(@Validated @RequestBody final Oportunidade entity) throws Exception {
    return oportunidadeBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{oportunidadeId}")
  public Oportunidade put(@Validated @RequestBody final Oportunidade entity, @PathVariable("oportunidadeId") java.lang.String oportunidadeId) throws Exception {
    return oportunidadeBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{oportunidadeId}")
  public void delete(@PathVariable("oportunidadeId") java.lang.String oportunidadeId) throws Exception {
    oportunidadeBusiness.delete(oportunidadeId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Oportunidade>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(oportunidadeBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{oportunidadeId}/Observacoes")    
  public HttpEntity<PagedResources<Observacoes>> findObservacoes(@PathVariable("oportunidadeId") java.lang.String oportunidadeId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(oportunidadeBusiness.findObservacoes(oportunidadeId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{oportunidadeId}/Observacoes/{observacoesId}")    
  public void deleteObservacoes(@PathVariable("observacoesId") java.lang.String observacoesId) throws Exception {
    this.observacoesBusiness.delete(observacoesId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{oportunidadeId}/Observacoes")
  public Observacoes putObservacoes(@Validated @RequestBody final Observacoes entity, @PathVariable("oportunidadeId") java.lang.String oportunidadeId) throws Exception {
    return this.observacoesBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{oportunidadeId}/Observacoes")
  public Observacoes postObservacoes(@Validated @RequestBody final Observacoes entity, @PathVariable("oportunidadeId") java.lang.String oportunidadeId) throws Exception {
    Oportunidade oportunidade = this.oportunidadeBusiness.get(oportunidadeId);
    entity.setOportunidade(oportunidade);
    return this.observacoesBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{oportunidadeId}")
  public Oportunidade get(@PathVariable("oportunidadeId") java.lang.String oportunidadeId) throws Exception {
    return oportunidadeBusiness.get(oportunidadeId);
  }

  /**
   * Foreign Key parceiro
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Parceiro/{parceiroId}")    
  public HttpEntity<PagedResources<Oportunidade>> findOportunidadesByParceiro(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(oportunidadeBusiness.findOportunidadesByParceiro(parceiroId, pageable)), HttpStatus.OK);
  }
}
