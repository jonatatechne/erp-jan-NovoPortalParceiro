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
 * Classe que representa a camada de negócios de CidadeBusiness
 * 
 * @generated
 **/
@Service("CidadeBusiness")
public class CidadeBusiness {



  /**
   * Instância da classe CidadeDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CidadeDAO")
  protected CidadeDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cidade post(final Cidade entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Cidade result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cidade put(final Cidade entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidade result = repository.saveAndFlush(entity);
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
    Cidade entity = this.get(id);
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
  public Cidade get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidade result = repository.findOne(id);
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
  public Page<Cidade> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Cidade> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key estado
   * @generated
   */
  public Page<Cidade> findCidadesByEstado(java.lang.Integer instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cidade> result = repository.findCidadesByEstado(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
