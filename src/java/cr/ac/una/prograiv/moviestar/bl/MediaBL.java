/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.bl;

import cr.ac.una.prograiv.moviestar.domain.Media;
import java.util.List;

/**
 *
 * @author Byron
 */
public class MediaBL extends BaseBL implements IBaseBL<Media, Integer>{

    public MediaBL() {
        super();
    }
    
    @Override
    public void save(Media o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public Media merge(Media o) {
        return (Media) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Media o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public Media findByOther(Media o) {
        return (Media) this.getDao(o.getClass().getName()).findByOther(o);
    }

    @Override
    public List<Media> findAllByOther(String o) {
        return this.getDao(Media.class.getName()).findAllByOther(o);
    }

    @Override
    public List<Media> findAll(String o) {
        return this.getDao(o).findAll();
    }
    
}
