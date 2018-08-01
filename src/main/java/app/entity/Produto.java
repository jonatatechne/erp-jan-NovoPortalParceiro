package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
public class Produto implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String valor;
  
  /**
  * @generated
  */
  @Column(name = "ativo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ativo;
  
  /**
   * Construtor
   * @generated
   */
  public Produto(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.Integer getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Produto setId(java.lang.Integer id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Produto setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém valor
   * return valor
   * @generated
   */
  public java.lang.String getValor(){
    return this.valor;
  }
  
  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Produto setValor(java.lang.String valor){
    this.valor = valor;
    return this;
  }
  
  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  public java.lang.String getAtivo(){
    return this.ativo;
  }
  
  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public Produto setAtivo(java.lang.String ativo){
    this.ativo = ativo;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
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
