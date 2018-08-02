package app.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que representa a tabela OBSERVACOES
 * @generated
 */
@Entity
@Table(name = "\"OBSERVACOES\"")
@XmlRootElement
public class Observacoes implements Serializable {

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
  @Column(name = "texto", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String texto;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date data;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_oportunidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Oportunidade oportunidade;
  
  /**
   * Construtor
   * @generated
   */
  public Observacoes(){
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
  public Observacoes setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém texto
   * return texto
   * @generated
   */
  public java.lang.String getTexto(){
    return this.texto;
  }
  
  /**
   * Define texto
   * @param texto texto
   * @generated
   */
  public Observacoes setTexto(java.lang.String texto){
    this.texto = texto;
    return this;
  }
  
  /**
   * Obtém data
   * return data
   * @generated
   */
  public java.util.Date getData(){
    return this.data;
  }
  
  /**
   * Define data
   * @param data data
   * @generated
   */
  public Observacoes setData(java.util.Date data){
    this.data = data;
    return this;
  }
  
  /**
   * Obtém oportunidade
   * return oportunidade
   * @generated
   */
  public Oportunidade getOportunidade(){
    return this.oportunidade;
  }
  
  /**
   * Define oportunidade
   * @param oportunidade oportunidade
   * @generated
   */
  public Observacoes setOportunidade(Oportunidade oportunidade){
    this.oportunidade = oportunidade;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Observacoes object = (Observacoes)obj;
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
