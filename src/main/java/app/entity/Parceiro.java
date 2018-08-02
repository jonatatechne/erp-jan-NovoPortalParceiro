package app.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que representa a tabela PARCEIRO
 * @generated
 */
@Entity
@Table(name = "\"PARCEIRO\"")
@XmlRootElement
public class Parceiro implements Serializable {

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
  @Column(name = "cpfCnpj", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String cpfCnpj;
  
  /**
  * @generated
  */
  @Column(name = "inscricaoEstadual", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String inscricaoEstadual;
  
  /**
  * @generated
  */
  @Column(name = "razaoSocialNome", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String razaoSocialNome;
  
  /**
  * @generated
  */
  @Column(name = "competencias", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String competencias;
  
  /**
  * @generated
  */
  @Column(name = "numeroColaboradores", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer numeroColaboradores;
  
  /**
  * @generated
  */
  @Column(name = "produtosServicos", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String produtosServicos;
  
  /**
  * @generated
  */
  @Column(name = "mercadoAlvo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String mercadoAlvo;
  
  /**
  * @generated
  */
  @Column(name = "clientesAtuais", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String clientesAtuais;
  
  /**
  * @generated
  */
  @Column(name = "motivo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String motivo;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_endereco", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Endereco endereco;
  
  /**
  * @generated
  */
  @Column(name = "nomeFantasia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nomeFantasia;
  
  /**
  * @generated
  */
  @Column(name = "website", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String website;
  
  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String telefone;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataCadastro", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dataCadastro;
  
  /**
  * @generated
  */
  @Column(name = "descricaoEmpresa", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricaoEmpresa;
  
  /**
  * @generated
  */
  @Column(name = "nivelParceria", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nivelParceria;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dataAlteracao;
  
  /**
   * Construtor
   * @generated
   */
  public Parceiro(){
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
  public Parceiro setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém cpfCnpj
   * return cpfCnpj
   * @generated
   */
  public java.lang.String getCpfCnpj(){
    return this.cpfCnpj;
  }
  
  /**
   * Define cpfCnpj
   * @param cpfCnpj cpfCnpj
   * @generated
   */
  public Parceiro setCpfCnpj(java.lang.String cpfCnpj){
    this.cpfCnpj = cpfCnpj;
    return this;
  }
  
  /**
   * Obtém inscricaoEstadual
   * return inscricaoEstadual
   * @generated
   */
  public java.lang.String getInscricaoEstadual(){
    return this.inscricaoEstadual;
  }
  
  /**
   * Define inscricaoEstadual
   * @param inscricaoEstadual inscricaoEstadual
   * @generated
   */
  public Parceiro setInscricaoEstadual(java.lang.String inscricaoEstadual){
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  /**
   * Obtém razaoSocialNome
   * return razaoSocialNome
   * @generated
   */
  public java.lang.String getRazaoSocialNome(){
    return this.razaoSocialNome;
  }
  
  /**
   * Define razaoSocialNome
   * @param razaoSocialNome razaoSocialNome
   * @generated
   */
  public Parceiro setRazaoSocialNome(java.lang.String razaoSocialNome){
    this.razaoSocialNome = razaoSocialNome;
    return this;
  }
  
  /**
   * Obtém competencias
   * return competencias
   * @generated
   */
  public java.lang.String getCompetencias(){
    return this.competencias;
  }
  
  /**
   * Define competencias
   * @param competencias competencias
   * @generated
   */
  public Parceiro setCompetencias(java.lang.String competencias){
    this.competencias = competencias;
    return this;
  }
  
  /**
   * Obtém numeroColaboradores
   * return numeroColaboradores
   * @generated
   */
  public java.lang.Integer getNumeroColaboradores(){
    return this.numeroColaboradores;
  }
  
  /**
   * Define numeroColaboradores
   * @param numeroColaboradores numeroColaboradores
   * @generated
   */
  public Parceiro setNumeroColaboradores(java.lang.Integer numeroColaboradores){
    this.numeroColaboradores = numeroColaboradores;
    return this;
  }
  
  /**
   * Obtém produtosServicos
   * return produtosServicos
   * @generated
   */
  public java.lang.String getProdutosServicos(){
    return this.produtosServicos;
  }
  
  /**
   * Define produtosServicos
   * @param produtosServicos produtosServicos
   * @generated
   */
  public Parceiro setProdutosServicos(java.lang.String produtosServicos){
    this.produtosServicos = produtosServicos;
    return this;
  }
  
  /**
   * Obtém mercadoAlvo
   * return mercadoAlvo
   * @generated
   */
  public java.lang.String getMercadoAlvo(){
    return this.mercadoAlvo;
  }
  
  /**
   * Define mercadoAlvo
   * @param mercadoAlvo mercadoAlvo
   * @generated
   */
  public Parceiro setMercadoAlvo(java.lang.String mercadoAlvo){
    this.mercadoAlvo = mercadoAlvo;
    return this;
  }
  
  /**
   * Obtém clientesAtuais
   * return clientesAtuais
   * @generated
   */
  public java.lang.String getClientesAtuais(){
    return this.clientesAtuais;
  }
  
  /**
   * Define clientesAtuais
   * @param clientesAtuais clientesAtuais
   * @generated
   */
  public Parceiro setClientesAtuais(java.lang.String clientesAtuais){
    this.clientesAtuais = clientesAtuais;
    return this;
  }
  
  /**
   * Obtém motivo
   * return motivo
   * @generated
   */
  public java.lang.String getMotivo(){
    return this.motivo;
  }
  
  /**
   * Define motivo
   * @param motivo motivo
   * @generated
   */
  public Parceiro setMotivo(java.lang.String motivo){
    this.motivo = motivo;
    return this;
  }
  
  /**
   * Obtém user
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public Parceiro setUser(User user){
    this.user = user;
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
  public Parceiro setEndereco(Endereco endereco){
    this.endereco = endereco;
    return this;
  }
  
  /**
   * Obtém nomeFantasia
   * return nomeFantasia
   * @generated
   */
  public java.lang.String getNomeFantasia(){
    return this.nomeFantasia;
  }
  
  /**
   * Define nomeFantasia
   * @param nomeFantasia nomeFantasia
   * @generated
   */
  public Parceiro setNomeFantasia(java.lang.String nomeFantasia){
    this.nomeFantasia = nomeFantasia;
    return this;
  }
  
  /**
   * Obtém website
   * return website
   * @generated
   */
  public java.lang.String getWebsite(){
    return this.website;
  }
  
  /**
   * Define website
   * @param website website
   * @generated
   */
  public Parceiro setWebsite(java.lang.String website){
    this.website = website;
    return this;
  }
  
  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  public java.lang.String getTelefone(){
    return this.telefone;
  }
  
  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public Parceiro setTelefone(java.lang.String telefone){
    this.telefone = telefone;
    return this;
  }
  
  /**
   * Obtém dataCadastro
   * return dataCadastro
   * @generated
   */
  public java.util.Date getDataCadastro(){
    return this.dataCadastro;
  }
  
  /**
   * Define dataCadastro
   * @param dataCadastro dataCadastro
   * @generated
   */
  public Parceiro setDataCadastro(java.util.Date dataCadastro){
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  /**
   * Obtém descricaoEmpresa
   * return descricaoEmpresa
   * @generated
   */
  public java.lang.String getDescricaoEmpresa(){
    return this.descricaoEmpresa;
  }
  
  /**
   * Define descricaoEmpresa
   * @param descricaoEmpresa descricaoEmpresa
   * @generated
   */
  public Parceiro setDescricaoEmpresa(java.lang.String descricaoEmpresa){
    this.descricaoEmpresa = descricaoEmpresa;
    return this;
  }
  
  /**
   * Obtém nivelParceria
   * return nivelParceria
   * @generated
   */
  public java.lang.String getNivelParceria(){
    return this.nivelParceria;
  }
  
  /**
   * Define nivelParceria
   * @param nivelParceria nivelParceria
   * @generated
   */
  public Parceiro setNivelParceria(java.lang.String nivelParceria){
    this.nivelParceria = nivelParceria;
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
  public Parceiro setDataAlteracao(java.util.Date dataAlteracao){
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
    Parceiro object = (Parceiro)obj;
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
