/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import cr.ac.una.prograiv.moviestar.domain.Detalles;
import cr.ac.una.prograiv.moviestar.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Byron
 */
public class DetallesDAO extends HibernateUtil implements IBaseDAO<Detalles, Integer>{

    @Override
    public void save(Detalles o) {
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
    public Detalles merge(Detalles o) {
        try {
            iniciaOperacion();
            o = (Detalles) getSesion().merge(o);
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
    public void delete(Detalles o) {
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
    public Detalles findByOther(Detalles o) {
        Detalles detalles = null;

        try {
            iniciaOperacion();
            detalles = (Detalles) getSesion().get(Detalles.class, o);
        } finally {
            getSesion().close();
        }
        return detalles;
    }

    @Override
    public List<Detalles> findAll() {
        List<Detalles> listaDetalles;
        try {
            iniciaOperacion();
            listaDetalles = getSesion().createQuery("from Detalles").list();
        } finally {
            getSesion().close();
        }

        return listaDetalles;
    }

    @Override
    public List<Detalles> findAllByOther(String o) {
        List<Detalles> lista= null;
       try {
            iniciaOperacion();
            Query query = getSesion().createQuery("from Detalles where = '"+ o +"'");
            lista= query.list();
        } finally {
            getSesion().close();
        }
       
        return lista;
    }

}
