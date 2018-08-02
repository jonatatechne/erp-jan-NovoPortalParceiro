package app.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que representa a tabela ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"ENDERECO\"")
@XmlRootElement
public class Endereco implements Serializable {

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
  @Column(name = "logradouro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String logradouro;
  
  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String numero;
  
  /**
  * @generated
  */
  @Column(name = "complemento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String complemento;
  
  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String bairro;
  
  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cep;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_cidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cidade cidade;
  
  /**
   * Construtor
   * @generated
   */
  public Endereco(){
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
  public Endereco setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }
  
  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public Endereco setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }
  
  /**
   * Obtém numero
   * return numero
   * @generated
   */
  public java.lang.String getNumero(){
    return this.numero;
  }
  
  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Endereco setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }
  
  /**
   * Obtém complemento
   * return complemento
   * @generated
   */
  public java.lang.String getComplemento(){
    return this.complemento;
  }
  
  /**
   * Define complemento
   * @param complemento complemento
   * @generated
   */
  public Endereco setComplemento(java.lang.String complemento){
    this.complemento = complemento;
    return this;
  }
  
  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  public java.lang.String getBairro(){
    return this.bairro;
  }
  
  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Endereco setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }
  
  /**
   * Obtém cep
   * return cep
   * @generated
   */
  public java.lang.String getCep(){
    return this.cep;
  }
  
  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Endereco setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }
  
  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  public Cidade getCidade(){
    return this.cidade;
  }
  
  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Endereco setCidade(Cidade cidade){
    this.cidade = cidade;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Endereco object = (Endereco)obj;
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
