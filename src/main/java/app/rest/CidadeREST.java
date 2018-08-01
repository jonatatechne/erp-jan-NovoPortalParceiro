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
 * Controller para expor serviços REST de Cidade
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Cidade")
public class CidadeREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public Cidade post(@Validated @RequestBody final Cidade entity) throws Exception {
    return cidadeBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cidade put(@Validated @RequestBody final Cidade entity) throws Exception {
    return cidadeBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{cidadeId}")
  public Cidade put(@Validated @RequestBody final Cidade entity, @PathVariable("cidadeId") java.lang.Integer cidadeId) throws Exception {
    return cidadeBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{cidadeId}")
  public void delete(@PathVariable("cidadeId") java.lang.Integer cidadeId) throws Exception {
    cidadeBusiness.delete(cidadeId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cidade>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{cidadeId}")
  public Cidade get(@PathVariable("cidadeId") java.lang.Integer cidadeId) throws Exception {
    return cidadeBusiness.get(cidadeId);
  }

  /**
   * Foreign Key estado
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Estado/{estadoId}")    
  public HttpEntity<PagedResources<Cidade>> findCidadesByEstado(@PathVariable("estadoId") java.lang.Integer estadoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.findCidadesByEstado(estadoId, pageable)), HttpStatus.OK);
  }
}
