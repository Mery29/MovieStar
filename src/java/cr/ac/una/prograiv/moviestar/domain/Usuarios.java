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
public class Usuarios implements java.io.Serializable{
    
    int pk_idUsuario;
    String usuario;
    String contraseña;
    String nombre;
    String apellidos;
    String correo;
    Date fechaNac;
    String direccion;
    int telCasa;
    int telCel;
    String tipoUsuario;

    public Usuarios() {
        
    }
    

    public Usuarios(int pk_idUsuario, String usuario, String contraseña, String nombre, String apellidos, String correo, Date fechaNac, String direccion, int telCasa, int telCel, String tipoUsuario) {
        this.pk_idUsuario = pk_idUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telCasa = telCasa;
        this.telCel = telCel;
        this.tipoUsuario = tipoUsuario;
    }

    public void setPk_idUsuario(int pk_idUsuario) {
        this.pk_idUsuario = pk_idUsuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelCasa(int telCasa) {
        this.telCasa = telCasa;
    }

    public void setTelCel(int telCel) {
        this.telCel = telCel;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getPk_idUsuario() {
        return pk_idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelCasa() {
        return telCasa;
    }

    public int getTelCel() {
        return telCel;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    
    
}
