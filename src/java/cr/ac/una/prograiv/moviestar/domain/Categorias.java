/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.domain;

/**
 *
 * @author Mery Zúñiga
 */
public class Categorias implements java.io.Serializable{
    
    int pk_idCateg;
    String nombre;
    String observaciones;

    public Categorias() {
    }

    public Categorias(int pk_id, String nombre, String observaciones) {
        this.pk_idCateg = pk_id;
        this.nombre = nombre;
        this.observaciones = observaciones;
    }

    public int getPk_id() {
        return pk_idCateg;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setPk_id(int pk_id) {
        this.pk_idCateg = pk_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
   
    
}
