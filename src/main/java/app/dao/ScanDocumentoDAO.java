package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ScanDocumentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ScanDocumentoDAO extends JpaRepository<ScanDocumento, java.lang.String> {

  /**
   * Obtém a instância de ScanDocumento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ScanDocumento entity WHERE entity.id = :id")
  public ScanDocumento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ScanDocumento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ScanDocumento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ScanDocumento c")
  public Page<ScanDocumento> list(Pageable pageable);
  


  /**
   * Foreign Key parceiro
   * @generated
   */
  @Query("SELECT entity FROM ScanDocumento entity WHERE entity.parceiro.id = :id")
  public Page<ScanDocumento> findScanDocumentosByParceiro(@Param(value="id") java.lang.String id, Pageable pageable);

}
