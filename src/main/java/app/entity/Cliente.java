package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
public class Cliente implements Serializable {

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
  @Column(name = "razaoSocial", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String razaoSocial;
  
  /**
  * @generated
  */
  @Column(name = "seguimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String seguimento;
  
  /**
  * @generated
  */
  @Column(name = "faturamento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String faturamento;
  
  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cnpj;
  
  /**
  * @generated
  */
  @Column(name = "classificacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String classificacao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_parceiro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Parceiro parceiro;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_endereco", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Endereco endereco;
  
  /**
  * @generated
  */
  @Column(name = "informacoesAdicionais", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String informacoesAdicionais;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataAlteracao;
  
  /**
   * Construtor
   * @generated
   */
  public Cliente(){
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
  public Cliente setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém razaoSocial
   * return razaoSocial
   * @generated
   */
  public java.lang.String getRazaoSocial(){
    return this.razaoSocial;
  }
  
  /**
   * Define razaoSocial
   * @param razaoSocial razaoSocial
   * @generated
   */
  public Cliente setRazaoSocial(java.lang.String razaoSocial){
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  /**
   * Obtém seguimento
   * return seguimento
   * @generated
   */
  public java.lang.String getSeguimento(){
    return this.seguimento;
  }
  
  /**
   * Define seguimento
   * @param seguimento seguimento
   * @generated
   */
  public Cliente setSeguimento(java.lang.String seguimento){
    this.seguimento = seguimento;
    return this;
  }
  
  /**
   * Obtém faturamento
   * return faturamento
   * @generated
   */
  public java.lang.String getFaturamento(){
    return this.faturamento;
  }
  
  /**
   * Define faturamento
   * @param faturamento faturamento
   * @generated
   */
  public Cliente setFaturamento(java.lang.String faturamento){
    this.faturamento = faturamento;
    return this;
  }
  
  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  public java.lang.String getCnpj(){
    return this.cnpj;
  }
  
  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public Cliente setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }
  
  /**
   * Obtém classificacao
   * return classificacao
   * @generated
   */
  public java.lang.String getClassificacao(){
    return this.classificacao;
  }
  
  /**
   * Define classificacao
   * @param classificacao classificacao
   * @generated
   */
  public Cliente setClassificacao(java.lang.String classificacao){
    this.classificacao = classificacao;
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
  public Cliente setParceiro(Parceiro parceiro){
    this.parceiro = parceiro;
    return this;
  }
  
  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  public Endereco getEndereco(){
    return this.endereco;
  }
  
  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Cliente setEndereco(Endereco endereco){
    this.endereco = endereco;
    return this;
  }
  
  /**
   * Obtém informacoesAdicionais
   * return informacoesAdicionais
   * @generated
   */
  public java.lang.String getInformacoesAdicionais(){
    return this.informacoesAdicionais;
  }
  
  /**
   * Define informacoesAdicionais
   * @param informacoesAdicionais informacoesAdicionais
   * @generated
   */
  public Cliente setInformacoesAdicionais(java.lang.String informacoesAdicionais){
    this.informacoesAdicionais = informacoesAdicionais;
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
  public Cliente setDataAlteracao(java.util.Date dataAlteracao){
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cliente object = (Cliente)obj;
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
