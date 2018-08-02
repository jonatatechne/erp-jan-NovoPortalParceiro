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
 * Classe que representa a tabela SCANDOCUMENTO
 * @generated
 */
@Entity
@Table(name = "\"SCANDOCUMENTO\"")
@XmlRootElement
public class ScanDocumento implements Serializable {

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
  @Column(name = "tipoDocumento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipoDocumento;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataEmissao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataEmissao;
  
  /**
  * @generated
  */
  @Column(name = "imagem", nullable = true, unique = false, insertable=true, updatable=true)
  private byte[] imagem;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataAlteracao;
  
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
  public ScanDocumento(){
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
  public ScanDocumento setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém tipoDocumento
   * return tipoDocumento
   * @generated
   */
  public java.lang.String getTipoDocumento(){
    return this.tipoDocumento;
  }
  
  /**
   * Define tipoDocumento
   * @param tipoDocumento tipoDocumento
   * @generated
   */
  public ScanDocumento setTipoDocumento(java.lang.String tipoDocumento){
    this.tipoDocumento = tipoDocumento;
    return this;
  }
  
  /**
   * Obtém dataEmissao
   * return dataEmissao
   * @generated
   */
  public java.util.Date getDataEmissao(){
    return this.dataEmissao;
  }
  
  /**
   * Define dataEmissao
   * @param dataEmissao dataEmissao
   * @generated
   */
  public ScanDocumento setDataEmissao(java.util.Date dataEmissao){
    this.dataEmissao = dataEmissao;
    return this;
  }
  
  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  public byte[] getImagem(){
    return this.imagem;
  }
  
  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public ScanDocumento setImagem(byte[] imagem){
    this.imagem = imagem;
    return this;
  }
  
  /**
   * Obtém dataAlteracao
   * return dataAlteracao
   * @generated
   */
  public java.util.Date getDataAlteracao(){
    return this.dataAlteracao;
  }
  
  /**
   * Define dataAlteracao
   * @param dataAlteracao dataAlteracao
   * @generated
   */
  public ScanDocumento setDataAlteracao(java.util.Date dataAlteracao){
    this.dataAlteracao = dataAlteracao;
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
  public ScanDocumento setParceiro(Parceiro parceiro){
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
    ScanDocumento object = (ScanDocumento)obj;
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
