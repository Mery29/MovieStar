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
public class Ordenes implements java.io.Serializable{
    int pk_idOrden;
    String estado;
    Date fecha_orden;
    int fk_idUsuario;

    public Ordenes() {
    }
   

    public Ordenes(int pk_idOrden, String estado, Date fecha_orden, int fk_idUsuario) {
        this.pk_idOrden = pk_idOrden;
        this.estado = estado;
        this.fecha_orden = fecha_orden;
        this.fk_idUsuario = fk_idUsuario;
    }

    public void setPk_idOrden(int pk_idOrden) {
        this.pk_idOrden = pk_idOrden;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_orden(Date fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public void setFk_idUsuario(int fk_idUsuario) {
        this.fk_idUsuario = fk_idUsuario;
    }

    public int getPk_idOrden() {
        return pk_idOrden;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFecha_orden() {
        return fecha_orden;
    }

    public int getFk_idUsuario() {
        return fk_idUsuario;
    }
    
    
    
}
