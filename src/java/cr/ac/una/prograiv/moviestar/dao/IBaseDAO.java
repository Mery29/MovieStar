/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import java.util.List;

/**
 *
 * @author Mery Zúñiga
 */
public interface IBaseDAO <T,K> {
    public abstract void save (T o);
    public abstract T merge (T o);
    public abstract void delete (T o);    
    public abstract T findByOther (T o);  //Le mando un objeto para que lo compare con la lista de objetos, y me devuelve ese objeto
    public abstract List<T> findAllByOther(String o);  //Le mando un atributo y me devuelve la lista que tiene de objetos que cuentan con ese atributo
    public abstract  List<T> findAll();   //Me devuelve todos los objetos de una clase.
    
}