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
 * Classe que representa a camada de negócios de TipoDocumentoBusiness
 * 
 * @generated
 **/
@Service("TipoDocumentoBusiness")
public class TipoDocumentoBusiness {



  /**
   * Instância da classe TipoDocumentoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TipoDocumentoDAO")
  protected TipoDocumentoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TipoDocumento post(final TipoDocumento entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    TipoDocumento result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TipoDocumento put(final TipoDocumento entity) throws Exception {
    // begin-user-code  
    // end-user-code
    TipoDocumento result = repository.saveAndFlush(entity);
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
    TipoDocumento entity = this.get(id);
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
  public TipoDocumento get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    TipoDocumento result = repository.findOne(id);
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
  public Page<TipoDocumento> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<TipoDocumento> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
}
