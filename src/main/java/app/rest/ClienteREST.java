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
 * Controller para expor serviços REST de Cliente
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Cliente")
public class ClienteREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ClienteBusiness")
  private ClienteBusiness clienteBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ParceiroBusiness")
  private ParceiroBusiness parceiroBusiness;

  /**
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
  public Cliente post(@Validated @RequestBody final Cliente entity) throws Exception {
    return clienteBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cliente put(@Validated @RequestBody final Cliente entity) throws Exception {
    return clienteBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{clienteId}")
  public Cliente put(@Validated @RequestBody final Cliente entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return clienteBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{clienteId}")
  public void delete(@PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    clienteBusiness.delete(clienteId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cliente>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{clienteId}/Contato")    
  public HttpEntity<PagedResources<Contato>> findContato(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.findContato(clienteId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{clienteId}/Contato/{contatoId}")    
  public void deleteContato(@PathVariable("contatoId") java.lang.String contatoId) throws Exception {
    this.contatoBusiness.delete(contatoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{clienteId}/Contato")
  public Contato putContato(@Validated @RequestBody final Contato entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return this.contatoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{clienteId}/Contato")
  public Contato postContato(@Validated @RequestBody final Contato entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Cliente cliente = this.clienteBusiness.get(clienteId);
    entity.setCliente(cliente);
    return this.contatoBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{clienteId}/Parceiro")
  public HttpEntity<PagedResources<Parceiro>> listParceiro(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.listParceiro(clienteId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{clienteId}/Parceiro")
  public Cliente postParceiro(@Validated @RequestBody final Parceiro entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Contato newContato = new Contato();

    Cliente cliente = this.clienteBusiness.get(clienteId);

    newContato.setParceiro(entity);
    newContato.setCliente(cliente);
    
    this.contatoBusiness.post(newContato);

    return newContato.getCliente();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{clienteId}/Parceiro/{ParceiroId}")
  public void deleteParceiro(@PathVariable("clienteId") java.lang.String clienteId, @PathVariable("ParceiroId") java.lang.String ParceiroId) {
    this.clienteBusiness.deleteParceiro(clienteId, ParceiroId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{clienteId}")
  public Cliente get(@PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return clienteBusiness.get(clienteId);
  }

  /**
   * Foreign Key parceiro
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Parceiro/{parceiroId}")    
  public HttpEntity<PagedResources<Cliente>> findClientesByParceiro(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.findClientesByParceiro(parceiroId, pageable)), HttpStatus.OK);
  }
}
