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
 * Classe que representa a camada de negócios de ContatoBusiness
 * 
 * @generated
 **/
@Service("ContatoBusiness")
public class ContatoBusiness {



  /**
   * Instância da classe ContatoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ContatoDAO")
  protected ContatoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Contato post(final Contato entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Contato result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Contato put(final Contato entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Contato result = repository.saveAndFlush(entity);
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
    Contato entity = this.get(id);
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
  public Contato get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Contato result = repository.findOne(id);
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
  public Page<Contato> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Contato> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key parceiro
   * @generated
   */
  public Page<Contato> findContatosByParceiro(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Contato> result = repository.findContatosByParceiro(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key cliente
   * @generated
   */
  public Page<Contato> findContatosByCliente(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Contato> result = repository.findContatosByCliente(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
