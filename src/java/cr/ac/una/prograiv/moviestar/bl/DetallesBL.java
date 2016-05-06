/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.bl;

import cr.ac.una.prograiv.moviestar.domain.Detalles;
import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import java.util.List;

/**
 *
 * @author Byron
 */
public class DetallesBL extends BaseBL implements IBaseBL<Detalles, Integer>{

    public DetallesBL() {
        super();
    }

    @Override
    public void save(Detalles o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public Detalles merge(Detalles o) {
        return (Detalles) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Detalles o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public Detalles findById(Integer o) {
        return (Detalles) this.getDao(o.getClass().getName()).findById(o);
    }

    @Override
    public List<Detalles> findAll(String className) {
        return this.getDao(className).findAll();
    }
}
