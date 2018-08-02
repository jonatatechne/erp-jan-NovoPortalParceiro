package app.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que representa a tabela USER
 * @generated
 */
@Entity
@Table(name = "\"USER\"")
@XmlRootElement
public class User implements Serializable {

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
  @Column(name = "login", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String login;
  
  /**
  * @generated
  */
  @Column(name = "password", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String password;
  
  /**
  * @generated
  */
  @Column(name = "ativo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Boolean ativo;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_parceiro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Parceiro parceiro;
  
  /**
   * Construtor
   * @generated
   */
  public User(){
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
  public User setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém login
   * return login
   * @generated
   */
  public java.lang.String getLogin(){
    return this.login;
  }
  
  /**
   * Define login
   * @param login login
   * @generated
   */
  public User setLogin(java.lang.String login){
    this.login = login;
    return this;
  }
  
  /**
   * Obtém password
   * return password
   * @generated
   */
  public java.lang.String getPassword(){
    return this.password;
  }
  
  /**
   * Define password
   * @param password password
   * @generated
   */
  public User setPassword(java.lang.String password){
    this.password = password;
    return this;
  }
  
  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  public java.lang.Boolean getAtivo(){
    return this.ativo;
  }
  
  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public User setAtivo(java.lang.Boolean ativo){
    this.ativo = ativo;
    return this;
  }
  
  /**
   * Obtém parceiro
   * return parceiro
   * @generated
   */
  public Parceiro getParceiro(){
    return this.parceiro;
  }
  
  /**
   * Define parceiro
   * @param parceiro parceiro
   * @generated
   */
  public User setParceiro(Parceiro parceiro){
    this.parceiro = parceiro;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    User object = (User)obj;
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
