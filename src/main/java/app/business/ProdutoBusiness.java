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
 * Classe que representa a camada de negócios de ProdutoBusiness
 * 
 * @generated
 **/
@Service("ProdutoBusiness")
public class ProdutoBusiness {



  /**
   * Instância da classe ProdutoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ProdutoDAO")
  protected ProdutoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Produto post(final Produto entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Produto result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Produto put(final Produto entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Produto result = repository.saveAndFlush(entity);
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
    Produto entity = this.get(id);
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
  public Produto get(java.lang.Integer id) throws Exception {
    // begin-user-code  
    // end-user-code
    Produto result = repository.findOne(id);
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
  public Page<Produto> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Produto> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
}
