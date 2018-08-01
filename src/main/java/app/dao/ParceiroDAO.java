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
@Repository("ParceiroDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ParceiroDAO extends JpaRepository<Parceiro, java.lang.String> {

  /**
   * Obtém a instância de Parceiro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Parceiro entity WHERE entity.id = :id")
  public Parceiro findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Parceiro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Parceiro entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Parceiro c")
  public Page<Parceiro> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.parceiro.id = :id")
  public Page<User> findUser(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Cliente entity WHERE entity.parceiro.id = :id")
  public Page<Cliente> findCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Oportunidade entity WHERE entity.parceiro.id = :id")
  public Page<Oportunidade> findOportunidade(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Contato entity WHERE entity.parceiro.id = :id")
  public Page<Contato> findContato(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ScanDocumento entity WHERE entity.parceiro.id = :id")
  public Page<ScanDocumento> findScanDocumento(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.cliente FROM Contato entity WHERE entity.parceiro.id = :id")
  public Page<Cliente> listCliente_2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Contato entity WHERE entity.parceiro.id = :instanceId AND entity.cliente.id = :relationId")
  public int deleteCliente_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
