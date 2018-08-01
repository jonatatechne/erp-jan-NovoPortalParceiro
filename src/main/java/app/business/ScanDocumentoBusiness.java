package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
import cloud.CloudManager;

/**
 * Classe que representa a camada de negócios de ScanDocumentoBusiness
 * 
 * @generated
 **/
@Service("ScanDocumentoBusiness")
public class ScanDocumentoBusiness {


  private static final String DROPBOX_APP_ACCESS_TOKEN = "ozsi494Wy9AAAAAAAAAACkacd0TjGP8ecAoRkmAeTrreV9I-F4Oh_cHNE5o7BcGZ";

  private final CloudManager cloudManager = CloudManager.newInstance().byID("id").toFields("imagem");

  /**
   * Instância da classe ScanDocumentoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ScanDocumentoDAO")
  protected ScanDocumentoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ScanDocumento post(final ScanDocumento entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    ScanDocumento result = null;
    byte[] imagem = entity.getImagem();
    result = repository.save(entity);
    result.setImagem(imagem);
    this.cloudManager.byEntity(result).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).upload();    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public ScanDocumento put(final ScanDocumento entity) throws Exception {
    // begin-user-code  
    // end-user-code
    ScanDocumento result = null;
    byte[] imagem = entity.getImagem();

    result = repository.saveAndFlush(entity);
    result.setImagem(imagem);
    this.cloudManager.byEntity(result).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).upload();
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
    ScanDocumento entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
      this.cloudManager.byEntity(entity).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).delete();
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public ScanDocumento get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    ScanDocumento result = repository.findOne(id);
    this.cloudManager.byEntity(result).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).popule(result);
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
  public Page<ScanDocumento> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<ScanDocumento> result = repository.list(pageable);
    result.forEach(item -> cloudManager.byEntity(item).build().dropbox(DROPBOX_APP_ACCESS_TOKEN).popule(item));
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key parceiro
   * @generated
   */
  public Page<ScanDocumento> findScanDocumentosByParceiro(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<ScanDocumento> result = repository.findScanDocumentosByParceiro(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
