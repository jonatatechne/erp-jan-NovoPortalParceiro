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
 * Controller para expor serviços REST de Estado
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Estado")
public class EstadoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EstadoBusiness")
  private EstadoBusiness estadoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("CidadeBusiness")
  private CidadeBusiness cidadeBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Estado post(@Validated @RequestBody final Estado entity) throws Exception {
    return estadoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Estado put(@Validated @RequestBody final Estado entity) throws Exception {
    return estadoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{estadoId}")
  public Estado put(@Validated @RequestBody final Estado entity, @PathVariable("estadoId") java.lang.Integer estadoId) throws Exception {
    return estadoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{estadoId}")
  public void delete(@PathVariable("estadoId") java.lang.Integer estadoId) throws Exception {
    estadoBusiness.delete(estadoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Estado>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(estadoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{estadoId}/Cidade")    
  public HttpEntity<PagedResources<Cidade>> findCidade(@PathVariable("estadoId") java.lang.Integer estadoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(estadoBusiness.findCidade(estadoId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{estadoId}/Cidade/{cidadeId}")    
  public void deleteCidade(@PathVariable("cidadeId") java.lang.Integer cidadeId) throws Exception {
    this.cidadeBusiness.delete(cidadeId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{estadoId}/Cidade")
  public Cidade putCidade(@Validated @RequestBody final Cidade entity, @PathVariable("estadoId") java.lang.Integer estadoId) throws Exception {
    return this.cidadeBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{estadoId}/Cidade")
  public Cidade postCidade(@Validated @RequestBody final Cidade entity, @PathVariable("estadoId") java.lang.Integer estadoId) throws Exception {
    Estado estado = this.estadoBusiness.get(estadoId);
    entity.setEstado(estado);
    return this.cidadeBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{estadoId}")
  public Estado get(@PathVariable("estadoId") java.lang.Integer estadoId) throws Exception {
    return estadoBusiness.get(estadoId);
  }
}
