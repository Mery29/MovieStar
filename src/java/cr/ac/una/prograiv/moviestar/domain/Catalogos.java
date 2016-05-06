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
public class Catalogos implements java.io.Serializable{
    int pk_idCata;
    String nombre;
    String director;
    String actor_princ;
    int fk_idCateg;
    int cantidad;
    String tipo;   //pelicula o serie
    float precio_alquiler;
    float precio_compra;

    public Catalogos() {
    }
       

    public Catalogos(int pk_id, String nombre, String director, String actor_princ, int fk_idCateg, int cantidad, String tipo, float precio_alquiler, float precio_compra) {
        this.pk_idCata = pk_id;
        this.nombre = nombre;
        this.director = director;
        this.actor_princ = actor_princ;
        this.fk_idCateg = fk_idCateg;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio_alquiler = precio_alquiler;
        this.precio_compra = precio_compra;
    }

    public void setPk_idCata(int pk_id) {
        this.pk_idCata = pk_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActor_princ(String actor_princ) {
        this.actor_princ = actor_princ;
    }

    public void setFk_idCateg(int fk_idCateg) {
        this.fk_idCateg = fk_idCateg;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio_alquiler(float precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }
    

    public int getPk_id() {
        return pk_idCata;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public String getActor_princ() {
        return actor_princ;
    }

    public int getFk_idCateg() {
        return fk_idCateg;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio_alquiler() {
        return precio_alquiler;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }
    
    
    
    
    
}
