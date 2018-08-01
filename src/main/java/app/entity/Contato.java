package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CONTATO
 * @generated
 */
@Entity
@Table(name = "\"CONTATO\"")
@XmlRootElement
public class Contato implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "telefones", nullable = true, unique = false, insertable=true, updatable=true)
  private Set<String> telefones = new HashSet<>();
  
  /**
  * @generated
  */
  @Column(name = "informacoesAdicionais", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String informacoesAdicionais;
  
  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  
  /**
  * @generated
  */
  @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cargo;
  
  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
  /**
  * @generated
  */
  @Column(name = "skype", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String skype;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_parceiro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Parceiro parceiro;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cliente cliente;
  
  /**
   * Construtor
   * @generated
   */
  public Contato(){
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
  public Contato setId(java.lang.String id){
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
  public Contato setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém telefones
   * return telefones
   * @generated
   */
  public Set<String> getTelefones(){
    return this.telefones;
  }
  
  /**
   * Define telefones
   * @param telefones telefones
   * @generated
   */
  public Set<String> setTelefones(Set<String> telefones){
    this.telefones = telefones;
    return this.telefones;
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
  public Contato setInformacoesAdicionais(java.lang.String informacoesAdicionais){
    this.informacoesAdicionais = informacoesAdicionais;
    return this;
  }
  
  /**
   * Obtém email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Contato setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  public java.lang.String getCargo(){
    return this.cargo;
  }
  
  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public Contato setCargo(java.lang.String cargo){
    this.cargo = cargo;
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
  public Contato setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  /**
   * Obtém skype
   * return skype
   * @generated
   */
  public java.lang.String getSkype(){
    return this.skype;
  }
  
  /**
   * Define skype
   * @param skype skype
   * @generated
   */
  public Contato setSkype(java.lang.String skype){
    this.skype = skype;
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
  public Contato setParceiro(Parceiro parceiro){
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
  public Contato setCliente(Cliente cliente){
    this.cliente = cliente;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Contato object = (Contato)obj;
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
