/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import cr.ac.una.prograiv.moviestar.domain.Categorias;
import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import cr.ac.una.prograiv.moviestar.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

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
    public Categorias findById(Integer o) {
        Categorias categorias = null;

        try {
            iniciaOperacion();
            categorias = (Categorias) getSesion().get(Categorias.class, o);
        } finally {
            getSesion().close();
        }
        return categorias;
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
    public List<Categorias> findByOther(String o) {
        List<Categorias> listaCategorias;
        try {
            iniciaOperacion();
            listaCategorias = getSesion().createQuery("from Categorias").list();
        } finally {
            getSesion().close();
        }

        return listaCategorias;
    }
    
}
