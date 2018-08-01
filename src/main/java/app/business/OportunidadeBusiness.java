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
 * Classe que representa a camada de negócios de OportunidadeBusiness
 * 
 * @generated
 **/
@Service("OportunidadeBusiness")
public class OportunidadeBusiness {



  /**
   * Instância da classe OportunidadeDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("OportunidadeDAO")
  protected OportunidadeDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Oportunidade post(final Oportunidade entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Oportunidade result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Oportunidade put(final Oportunidade entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Oportunidade result = repository.saveAndFlush(entity);
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
    Oportunidade entity = this.get(id);
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
  public Oportunidade get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Oportunidade result = repository.findOne(id);
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
  public Page<Oportunidade> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Oportunidade> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Observacoes> findObservacoes(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Observacoes> result = repository.findObservacoes(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Foreign Key parceiro
   * @generated
   */
  public Page<Oportunidade> findOportunidadesByParceiro(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Oportunidade> result = repository.findOportunidadesByParceiro(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
