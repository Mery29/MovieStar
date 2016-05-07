/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import cr.ac.una.prograiv.moviestar.domain.Categorias;
import cr.ac.una.prograiv.moviestar.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Byron
 */
public class CategoriasDAO extends HibernateUtil implements IBaseDAO<Categorias, Integer>{

    @Override
    public void save(Categorias o) {
        try {
            iniciaOperacion();
            getSesion().save(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public Categorias merge(Categorias o) {
        try {
            iniciaOperacion();
            o = (Categorias) getSesion().merge(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
        return o;
    }

    @Override
    public void delete(Categorias o) {
        try {
            iniciaOperacion();
            getSesion().delete(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public Categorias findByOther(Categorias c) {
        Categorias categoria = null;

        try {
            iniciaOperacion();
            categoria = (Categorias) getSesion().get(Categorias.class, c);
        } finally {
            getSesion().close();
        }
        return categoria;
    }


    @Override
    public List<Categorias> findAll() {
        List<Categorias> listaCategorias;
        try {
            iniciaOperacion();
            listaCategorias = getSesion().createQuery("from Categorias").list();
        } finally {
            getSesion().close();
        }

        return listaCategorias;
    }

    @Override
    public List<Categorias> findAllByOther(String o) {
         List<Categorias> lista= null;
       try {
            iniciaOperacion();
            Query query = getSesion().createQuery("from Categorias where = '"+ o +"'");
            lista= query.list();
        } finally {
            getSesion().close();
        }
       
        return lista;
    }

   
    
}
