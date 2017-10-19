/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba.sentidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Debora
 */
@Entity
@Table(name = "DATATIPOUSUARIO")
@XmlRootElement
public class DataTipoUsuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDT")
    private Integer iddt;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CREATED")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date created;
    @Column(name = "UPDATEDD")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date updatedd;

    public DataTipoUsuario() {
    }

    public DataTipoUsuario(Integer iddt, String nombre, Date created, Date updatedd) {
        this.iddt = iddt;
        this.nombre = nombre;
        this.created = created;
        this.updatedd = updatedd;
    }

    public Integer getIddt() {
        return iddt;
    }

    public void setIddt(Integer iddt) {
        this.iddt = iddt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdatedd() {
        return updatedd;
    }

    public void setUpdatedd(Date updatedd) {
        this.updatedd = updatedd;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.iddt);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.created);
        hash = 97 * hash + Objects.hashCode(this.updatedd);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataTipoUsuario other = (DataTipoUsuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.iddt, other.iddt)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.updatedd, other.updatedd)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataTipoUsuario{" + "iddt=" + iddt + ", nombre=" + nombre + ", created=" + created + ", updatedd=" + updatedd + '}';
    }

 
    
    
    
}
