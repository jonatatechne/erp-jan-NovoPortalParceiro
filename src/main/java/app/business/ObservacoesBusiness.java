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
 * Classe que representa a camada de negócios de ObservacoesBusiness
 * 
 * @generated
 **/
@Service("ObservacoesBusiness")
public class ObservacoesBusiness {



  /**
   * Instância da classe ObservacoesDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ObservacoesDAO")
  protected ObservacoesDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Observacoes post(final Observacoes entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Observacoes result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Observacoes put(final Observacoes entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Observacoes result = repository.saveAndFlush(entity);
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
    Observacoes entity = this.get(id);
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
  public Observacoes get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Observacoes result = repository.findOne(id);
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
  public Page<Observacoes> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Observacoes> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key oportunidade
   * @generated
   */
  public Page<Observacoes> findObservacoessByOportunidade(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Observacoes> result = repository.findObservacoessByOportunidade(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
