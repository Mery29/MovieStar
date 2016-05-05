/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.bl;

import cr.ac.una.prograiv.moviestar.dao.CatalogosDAO;
import cr.ac.una.prograiv.moviestar.dao.CategoriasDAO;
import cr.ac.una.prograiv.moviestar.dao.DetallesDAO;
import cr.ac.una.prograiv.moviestar.dao.IBaseDAO;
import cr.ac.una.prograiv.moviestar.dao.OrdenesDAO;
import cr.ac.una.prograiv.moviestar.dao.UsuariosDAO;
import java.util.LinkedHashMap;

/**
 *
 * @author Byron
 */
public class BaseBL {
private final LinkedHashMap<String, IBaseDAO> daos;

    public BaseBL() {
        daos = new LinkedHashMap();
        daos.put("cr.ac.una.prograiv.moviestar.domain.Catalogos", new CatalogosDAO());
        daos.put("cr.ac.una.prograiv.moviestar.domain.Categorias", new CategoriasDAO());
        daos.put("cr.ac.una.prograiv.moviestar.domain.Detalles", new DetallesDAO());
        daos.put("cr.ac.una.prograiv.moviestar.domain.Ordenes", new OrdenesDAO());
        daos.put("cr.ac.una.prograiv.moviestar.domain.Usuarios", new UsuariosDAO());
    }
    
    public IBaseDAO getDao(String className){
        return daos.get(className);
    }
}
