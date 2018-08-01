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
@Repository("ObservacoesDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ObservacoesDAO extends JpaRepository<Observacoes, java.lang.String> {

  /**
   * Obtém a instância de Observacoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Observacoes entity WHERE entity.id = :id")
  public Observacoes findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Observacoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Observacoes entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Observacoes c")
  public Page<Observacoes> list(Pageable pageable);
  


  /**
   * Foreign Key oportunidade
   * @generated
   */
  @Query("SELECT entity FROM Observacoes entity WHERE entity.oportunidade.id = :id")
  public Page<Observacoes> findObservacoessByOportunidade(@Param(value="id") java.lang.String id, Pageable pageable);

}
