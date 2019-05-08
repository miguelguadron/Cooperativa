/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miguel.guadronusam
 */
@Entity
@Table(name = "transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")
    , @NamedQuery(name = "Transaccion.findByIdTransaccion", query = "SELECT t FROM Transaccion t WHERE t.idTransaccion = :idTransaccion")
    , @NamedQuery(name = "Transaccion.findByMontocargo", query = "SELECT t FROM Transaccion t WHERE t.montocargo = :montocargo")
    , @NamedQuery(name = "Transaccion.findByMontoabono", query = "SELECT t FROM Transaccion t WHERE t.montoabono = :montoabono")
    , @NamedQuery(name = "Transaccion.findByFecha", query = "SELECT t FROM Transaccion t WHERE t.fecha = :fecha")
    ,	@NamedQuery(name="transacciones.byCuenta", query="SELECT t FROM Transaccion t WHERE t.idCuenta =:idCuenta")
})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transaccion")
    private Integer idTransaccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montocargo")
    private Float montocargo;
    @Column(name = "montoabono")
    private Float montoabono;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne
    private Cuenta idCuenta;

    public Transaccion() {
    }

    public Transaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Float getMontocargo() {
        return montocargo;
    }

    public void setMontocargo(Float montocargo) {
        this.montocargo = montocargo;
    }

    public Float getMontoabono() {
        return montoabono;
    }

    public void setMontoabono(Float montoabono) {
        this.montoabono = montoabono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cuenta getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Cuenta idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaccion != null ? idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.idTransaccion == null && other.idTransaccion != null) || (this.idTransaccion != null && !this.idTransaccion.equals(other.idTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Transaccion[ idTransaccion=" + idTransaccion + " ]";
    }
    
}
