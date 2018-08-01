package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de ParceiroBusiness
 * 
 * @generated
 **/
@Service("ParceiroBusiness")
public class ParceiroBusiness {



  /**
   * Instância da classe ParceiroDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ParceiroDAO")
  protected ParceiroDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Parceiro post(final Parceiro entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Parceiro result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Parceiro put(final Parceiro entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Parceiro result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Parceiro entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Parceiro get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Parceiro result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Parceiro> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Parceiro> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<User> findUser(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<User> result = repository.findUser(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Cliente> findCliente(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cliente> result = repository.findCliente(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Oportunidade> findOportunidade(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Oportunidade> result = repository.findOportunidade(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Contato> findContato(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Contato> result = repository.findContato(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<ScanDocumento> findScanDocumento(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<ScanDocumento> result = repository.findScanDocumento(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Cliente> listCliente_2(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cliente> result = repository.listCliente_2(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteCliente_2(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteCliente_2(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
}
