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
 * Controller para expor serviços REST de Parceiro
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Parceiro")
public class ParceiroREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ParceiroBusiness")
  private ParceiroBusiness parceiroBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ClienteBusiness")
  private ClienteBusiness clienteBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("UserBusiness")
  private UserBusiness userBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("OportunidadeBusiness")
  private OportunidadeBusiness oportunidadeBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ContatoBusiness")
  private ContatoBusiness contatoBusiness;

  /**
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
  public Parceiro post(@Validated @RequestBody final Parceiro entity) throws Exception {
    return parceiroBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Parceiro put(@Validated @RequestBody final Parceiro entity) throws Exception {
    return parceiroBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{parceiroId}")
  public Parceiro put(@Validated @RequestBody final Parceiro entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return parceiroBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{parceiroId}")
  public void delete(@PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    parceiroBusiness.delete(parceiroId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Parceiro>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{parceiroId}/User")    
  public HttpEntity<PagedResources<User>> findUser(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.findUser(parceiroId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{parceiroId}/User/{userId}")    
  public void deleteUser(@PathVariable("userId") java.lang.String userId) throws Exception {
    this.userBusiness.delete(userId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{parceiroId}/User")
  public User putUser(@Validated @RequestBody final User entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return this.userBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{parceiroId}/User")
  public User postUser(@Validated @RequestBody final User entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    Parceiro parceiro = this.parceiroBusiness.get(parceiroId);
    entity.setParceiro(parceiro);
    return this.userBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{parceiroId}/Cliente")    
  public HttpEntity<PagedResources<Cliente>> findCliente(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.findCliente(parceiroId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{parceiroId}/Cliente/{clienteId}")    
  public void deleteCliente(@PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    this.clienteBusiness.delete(clienteId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{parceiroId}/Cliente")
  public Cliente putCliente(@Validated @RequestBody final Cliente entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return this.clienteBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{parceiroId}/Cliente")
  public Cliente postCliente(@Validated @RequestBody final Cliente entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    Parceiro parceiro = this.parceiroBusiness.get(parceiroId);
    entity.setParceiro(parceiro);
    return this.clienteBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{parceiroId}/Oportunidade")    
  public HttpEntity<PagedResources<Oportunidade>> findOportunidade(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.findOportunidade(parceiroId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{parceiroId}/Oportunidade/{oportunidadeId}")    
  public void deleteOportunidade(@PathVariable("oportunidadeId") java.lang.String oportunidadeId) throws Exception {
    this.oportunidadeBusiness.delete(oportunidadeId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{parceiroId}/Oportunidade")
  public Oportunidade putOportunidade(@Validated @RequestBody final Oportunidade entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return this.oportunidadeBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{parceiroId}/Oportunidade")
  public Oportunidade postOportunidade(@Validated @RequestBody final Oportunidade entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    Parceiro parceiro = this.parceiroBusiness.get(parceiroId);
    entity.setParceiro(parceiro);
    return this.oportunidadeBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{parceiroId}/Contato")    
  public HttpEntity<PagedResources<Contato>> findContato(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.findContato(parceiroId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{parceiroId}/Contato/{contatoId}")    
  public void deleteContato(@PathVariable("contatoId") java.lang.String contatoId) throws Exception {
    this.contatoBusiness.delete(contatoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{parceiroId}/Contato")
  public Contato putContato(@Validated @RequestBody final Contato entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return this.contatoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{parceiroId}/Contato")
  public Contato postContato(@Validated @RequestBody final Contato entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    Parceiro parceiro = this.parceiroBusiness.get(parceiroId);
    entity.setParceiro(parceiro);
    return this.contatoBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{parceiroId}/ScanDocumento")    
  public HttpEntity<PagedResources<ScanDocumento>> findScanDocumento(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.findScanDocumento(parceiroId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{parceiroId}/ScanDocumento/{scanDocumentoId}")    
  public void deleteScanDocumento(@PathVariable("scanDocumentoId") java.lang.String scanDocumentoId) throws Exception {
    this.scanDocumentoBusiness.delete(scanDocumentoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{parceiroId}/ScanDocumento")
  public ScanDocumento putScanDocumento(@Validated @RequestBody final ScanDocumento entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return this.scanDocumentoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{parceiroId}/ScanDocumento")
  public ScanDocumento postScanDocumento(@Validated @RequestBody final ScanDocumento entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    Parceiro parceiro = this.parceiroBusiness.get(parceiroId);
    entity.setParceiro(parceiro);
    return this.scanDocumentoBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{parceiroId}/Cliente_2")
  public HttpEntity<PagedResources<Cliente>> listCliente_2(@PathVariable("parceiroId") java.lang.String parceiroId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(parceiroBusiness.listCliente_2(parceiroId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{parceiroId}/Cliente_2")
  public Parceiro postCliente_2(@Validated @RequestBody final Cliente entity, @PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    Contato newContato = new Contato();

    Parceiro parceiro = this.parceiroBusiness.get(parceiroId);

    newContato.setCliente(entity);
    newContato.setParceiro(parceiro);
    
    this.contatoBusiness.post(newContato);

    return newContato.getParceiro();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{parceiroId}/Cliente_2/{Cliente_2Id}")
  public void deleteCliente_2(@PathVariable("parceiroId") java.lang.String parceiroId, @PathVariable("Cliente_2Id") java.lang.String Cliente_2Id) {
    this.parceiroBusiness.deleteCliente_2(parceiroId, Cliente_2Id);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{parceiroId}")
  public Parceiro get(@PathVariable("parceiroId") java.lang.String parceiroId) throws Exception {
    return parceiroBusiness.get(parceiroId);
  }
}
