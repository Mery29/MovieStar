/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.domain;

import java.util.Date;

/**
 *
 * @author Mery Zúñiga
 */
public class Detalles implements java.io.Serializable{
    
    int fk_idOrdenes;
    int fk_idCatalogos;
    String tipo;
    Date fechaLimite;
    float precio;

    public Detalles() {
    }

    public Detalles(int fk_idOrdenes, int fk_idCatalogos, String tipo, Date fechaLimite, float precio) {
        this.fk_idOrdenes = fk_idOrdenes;
        this.fk_idCatalogos = fk_idCatalogos;
        this.tipo = tipo;
        this.fechaLimite = fechaLimite;
        this.precio = precio;
    }

    
    public void setFk_idOrdenes(int fk_idOrdenes) {
        this.fk_idOrdenes = fk_idOrdenes;
    }

    public void setFk_idCatalogos(int fk_idCatalogos) {
        this.fk_idCatalogos = fk_idCatalogos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getFk_idOrdenes() {
        return fk_idOrdenes;
    }

    public int getFk_idCatalogos() {
        return fk_idCatalogos;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public float getPrecio() {
        return precio;
    }
    
    
    
    
}
