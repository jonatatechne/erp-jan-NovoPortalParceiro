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
 * Classe que representa a camada de negócios de EstadoBusiness
 * 
 * @generated
 **/
@Service("EstadoBusiness")
public class EstadoBusiness {



  /**
   * Instância da classe EstadoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EstadoDAO")
  protected EstadoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Estado post(final Estado entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Estado result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Estado put(final Estado entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Estado result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.Integer id) throws Exception {
    Estado entity = this.get(id);
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
  public Estado get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    Estado result = repository.findOne(id);
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
  public Page<Estado> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Estado> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Cidade> findCidade(java.lang.Integer id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cidade> result = repository.findCidade(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
}
