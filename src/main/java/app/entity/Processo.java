package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PROCESSO
* @generated
*/
@Entity
@Table(name = "\"PROCESSO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Processo")
public class Processo implements Serializable {

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
    @Column(name = "numero_processo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String numero_processo;

    /**
    * @generated
    */
    @Column(name = "spi_equivalente", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String spi_equivalente;

    /**
    * @generated
    */
    @Column(name = "assunto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String assunto;

    /**
    * @generated
    */
    @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo;

    /**
    * @generated
    */
    @Column(name = "subtipo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String subtipo;

    /**
    * @generated
    */
    @Column(name = "origem", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String origem;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "abertura", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date abertura;

    /**
    * @generated
    */
    @Column(name = "grau_privacidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String grau_privacidade;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_requerente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Requerente requerente;

    /**
    * Construtor
    * @generated
    */
    public Processo(){
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
    public Processo setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém numero_processo
    * return numero_processo
    * @generated
    */
    
    public java.lang.String getNumero_processo(){
        return this.numero_processo;
    }

    /**
    * Define numero_processo
    * @param numero_processo numero_processo
    * @generated
    */
    public Processo setNumero_processo(java.lang.String numero_processo){
        this.numero_processo = numero_processo;
        return this;
    }
    /**
    * Obtém spi_equivalente
    * return spi_equivalente
    * @generated
    */
    
    public java.lang.String getSpi_equivalente(){
        return this.spi_equivalente;
    }

    /**
    * Define spi_equivalente
    * @param spi_equivalente spi_equivalente
    * @generated
    */
    public Processo setSpi_equivalente(java.lang.String spi_equivalente){
        this.spi_equivalente = spi_equivalente;
        return this;
    }
    /**
    * Obtém assunto
    * return assunto
    * @generated
    */
    
    public java.lang.String getAssunto(){
        return this.assunto;
    }

    /**
    * Define assunto
    * @param assunto assunto
    * @generated
    */
    public Processo setAssunto(java.lang.String assunto){
        this.assunto = assunto;
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
    public Processo setTipo(java.lang.String tipo){
        this.tipo = tipo;
        return this;
    }
    /**
    * Obtém subtipo
    * return subtipo
    * @generated
    */
    
    public java.lang.String getSubtipo(){
        return this.subtipo;
    }

    /**
    * Define subtipo
    * @param subtipo subtipo
    * @generated
    */
    public Processo setSubtipo(java.lang.String subtipo){
        this.subtipo = subtipo;
        return this;
    }
    /**
    * Obtém origem
    * return origem
    * @generated
    */
    
    public java.lang.String getOrigem(){
        return this.origem;
    }

    /**
    * Define origem
    * @param origem origem
    * @generated
    */
    public Processo setOrigem(java.lang.String origem){
        this.origem = origem;
        return this;
    }
    /**
    * Obtém abertura
    * return abertura
    * @generated
    */
    
    public java.util.Date getAbertura(){
        return this.abertura;
    }

    /**
    * Define abertura
    * @param abertura abertura
    * @generated
    */
    public Processo setAbertura(java.util.Date abertura){
        this.abertura = abertura;
        return this;
    }
    /**
    * Obtém grau_privacidade
    * return grau_privacidade
    * @generated
    */
    
    public java.lang.String getGrau_privacidade(){
        return this.grau_privacidade;
    }

    /**
    * Define grau_privacidade
    * @param grau_privacidade grau_privacidade
    * @generated
    */
    public Processo setGrau_privacidade(java.lang.String grau_privacidade){
        this.grau_privacidade = grau_privacidade;
        return this;
    }
    /**
    * Obtém requerente
    * return requerente
    * @generated
    */
    
    public Requerente getRequerente(){
        return this.requerente;
    }

    /**
    * Define requerente
    * @param requerente requerente
    * @generated
    */
    public Processo setRequerente(Requerente requerente){
        this.requerente = requerente;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Processo object = (Processo)obj;
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