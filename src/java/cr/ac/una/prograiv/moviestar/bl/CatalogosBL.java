/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.bl;

import cr.ac.una.prograiv.moviestar.domain.Catalogos;
import java.util.List;

/**
 *
 * @author Byron
 */
public class CatalogosBL extends BaseBL implements IBaseBL<Catalogos, Integer>{

    public CatalogosBL() {
        super();
    }

    @Override
    public void save(Catalogos o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public Catalogos merge(Catalogos o) {
        return (Catalogos) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Catalogos o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public Catalogos findByOther(Catalogos o) {
        return (Catalogos) this.getDao(o.getClass().getName()).findByOther(o);
    }

    @Override
    public List<Catalogos> findAllByOther(String className) {
        return this.getDao(Catalogos.class.getName()).findAllByOther(className);
    }
    
    public List<Catalogos> findAll(String o) {
        return this.getDao(o).findAll();
    }
    
}