/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.bl;

import cr.ac.una.prograiv.moviestar.domain.Ordenes;
import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import java.util.List;

/**
 *
 * @author Byron
 */
public class UsuariosBL extends BaseBL implements IBaseBL<Usuarios, Integer>{

    public UsuariosBL() {
        super();
    }

    @Override
    public void save(Usuarios o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public Usuarios merge(Usuarios o) {
        return (Usuarios) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Usuarios o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public Usuarios findByOther(Usuarios o) {
        return (Usuarios) this.getDao(o.getClass().getName()).findByOther(o);
    }

    @Override
    public List<Usuarios> findAllByOther(String o) {
        return this.getDao(Usuarios.class.getName()).findAllByOther(o);
    }
    
    @Override
    public List<Usuarios> findAll(String o) {
        return this.getDao(o).findAll();
    }
    
}
