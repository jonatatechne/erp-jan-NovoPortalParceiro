package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela OPORTUNIDADE
 * @generated
 */
@Entity
@Table(name = "\"OPORTUNIDADE\"")
@XmlRootElement
public class Oportunidade implements Serializable {

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
  @Column(name = "estagio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String estagio;
  
  /**
  * @generated
  */
  @Column(name = "dataCadastro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String dataCadastro;
  
  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String valor;
  
  /**
  * @generated
  */
  @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String status;
  
  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
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
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cliente cliente;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Produto produto;
  
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
  public Oportunidade(){
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
  public Oportunidade setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém estagio
   * return estagio
   * @generated
   */
  public java.lang.String getEstagio(){
    return this.estagio;
  }
  
  /**
   * Define estagio
   * @param estagio estagio
   * @generated
   */
  public Oportunidade setEstagio(java.lang.String estagio){
    this.estagio = estagio;
    return this;
  }
  
  /**
   * Obtém dataCadastro
   * return dataCadastro
   * @generated
   */
  public java.lang.String getDataCadastro(){
    return this.dataCadastro;
  }
  
  /**
   * Define dataCadastro
   * @param dataCadastro dataCadastro
   * @generated
   */
  public Oportunidade setDataCadastro(java.lang.String dataCadastro){
    this.dataCadastro = dataCadastro;
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
  public Oportunidade setValor(java.lang.String valor){
    this.valor = valor;
    return this;
  }
  
  /**
   * Obtém status
   * return status
   * @generated
   */
  public java.lang.String getStatus(){
    return this.status;
  }
  
  /**
   * Define status
   * @param status status
   * @generated
   */
  public Oportunidade setStatus(java.lang.String status){
    this.status = status;
    return this;
  }
  
  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  public java.lang.String getTipo(){
    return this.tipo;
  }
  
  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Oportunidade setTipo(java.lang.String tipo){
    this.tipo = tipo;
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
  public Oportunidade setParceiro(Parceiro parceiro){
    this.parceiro = parceiro;
    return this;
  }
  
  /**
   * Obtém cliente
   * return cliente
   * @generated
   */
  public Cliente getCliente(){
    return this.cliente;
  }
  
  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public Oportunidade setCliente(Cliente cliente){
    this.cliente = cliente;
    return this;
  }
  
  /**
   * Obtém produto
   * return produto
   * @generated
   */
  public Produto getProduto(){
    return this.produto;
  }
  
  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public Oportunidade setProduto(Produto produto){
    this.produto = produto;
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
  public Oportunidade setDataAlteracao(java.util.Date dataAlteracao){
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
    Oportunidade object = (Oportunidade)obj;
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
