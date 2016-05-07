/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.bl;

import cr.ac.una.prograiv.moviestar.domain.Detalles;
import cr.ac.una.prograiv.moviestar.domain.Ordenes;
import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import java.util.List;

/**
 *
 * @author Byron
 */
public class OrdenesBL extends BaseBL implements IBaseBL<Ordenes, Integer>{

    public OrdenesBL() {
        super();
    }

    @Override
    public void save(Ordenes o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public Ordenes merge(Ordenes o) {
        return (Ordenes) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(Ordenes o) {
        this.getDao(o.getClass().getName()).delete(o);
        /*
         List<Telefonos> telefonos= this.getDao(Telefonos.class.getName()).findAll();
        List<Direcciones> direcciones= this.getDao(Direcciones.class.getName()).findAll();
        int numTelefonos= 0;
        int numDirecciones= 0;
        int id= o.getPkCedula();
        for(int i=0; i<=telefonos.size(); i++){
            if(telefonos.get(i).getPersonas().getPkCedula() == id){
                numTelefonos++;
            }
        }
        */
    }

    @Override
    public Ordenes findByOther(Ordenes o) {
        return (Ordenes) this.getDao(o.getClass().getName()).findByOther(o);
    }
    
    @Override
    public List<Ordenes> findAllByOther(String className) {
        return this.getDao(Ordenes.class.getName()).findAllByOther(className);
    }

    @Override
    public List<Ordenes> findAll(String o) {
        return this.getDao(o).findAll();
    }
    
    
}
