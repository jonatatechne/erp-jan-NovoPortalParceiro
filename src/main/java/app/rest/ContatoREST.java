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
 * Controller para expor serviços REST de Contato
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Contato")
public class ContatoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ContatoBusiness")
  private ContatoBusiness contatoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Contato post(@Validated @RequestBody final Contato entity) throws Exception {
    return contatoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Contato put(@Validated @RequestBody final Contato entity) throws Exception {
    return contatoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{contatoId}")
  public Contato put(@Validated @RequestBody final Contato entity, @PathVariable("contatoId") java.lang.String contatoId) throws Exception {
    return contatoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{contatoId}")
  public void delete(@PathVariable("contatoId") java.lang.String contatoId) throws Exception {
    contatoBusiness.delete(contatoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Contato>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(contatoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{contatoId}")
  public Contato get(@PathVariable("contatoId") java.lang.String contatoId) throws Exception {
    return contatoBusiness.get(contatoId);
  }

  /**
   * Foreign Key parceiro
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Parceiro/{parceiroId}")    
  public HttpEntity<PagedResources<Contato>> findContatosByParceiro(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(contatoBusiness.findContatosByParceiro(parceiroId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key cliente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cliente/{clienteId}")    
  public HttpEntity<PagedResources<Contato>> findContatosByCliente(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(contatoBusiness.findContatosByCliente(clienteId, pageable)), HttpStatus.OK);
  }
}
