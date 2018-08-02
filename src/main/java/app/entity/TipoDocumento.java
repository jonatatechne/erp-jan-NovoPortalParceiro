package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TIPODOCUMENTO
 * @generated
 */
@Entity
@Table(name = "\"TIPODOCUMENTO\"")
@XmlRootElement
public class TipoDocumento implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "nomeDoc", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeDoc;
  
  /**
  * @generated
  */
  @Column(name = "validade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer validade;
  
  /**
   * Construtor
   * @generated
   */
  public TipoDocumento(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public TipoDocumento setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nomeDoc
   * return nomeDoc
   * @generated
   */
  public java.lang.String getNomeDoc(){
    return this.nomeDoc;
  }
  
  /**
   * Define nomeDoc
   * @param nomeDoc nomeDoc
   * @generated
   */
  public TipoDocumento setNomeDoc(java.lang.String nomeDoc){
    this.nomeDoc = nomeDoc;
    return this;
  }
  
  /**
   * Obtém validade
   * return validade
   * @generated
   */
  public java.lang.Integer getValidade(){
    return this.validade;
  }
  
  /**
   * Define validade
   * @param validade validade
   * @generated
   */
  public TipoDocumento setValidade(java.lang.Integer validade){
    this.validade = validade;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TipoDocumento object = (TipoDocumento)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}
