/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import cr.ac.una.prograiv.moviestar.domain.Ordenes;
import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import cr.ac.una.prograiv.moviestar.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Byron
 */
public class OrdenesDAO extends HibernateUtil implements IBaseDAO<Ordenes, Integer>{

    @Override
    public void save(Ordenes o) {
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
    public Ordenes merge(Ordenes o) {
        try {
            iniciaOperacion();
            o = (Ordenes) getSesion().merge(o);
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
    public void delete(Ordenes o) {
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
    public Ordenes findById(Integer o) {
        Ordenes ordenes = null;

        try {
            iniciaOperacion();
            ordenes = (Ordenes) getSesion().get(Ordenes.class, o);
        } finally {
            getSesion().close();
        }
        return ordenes;
    }

    @Override
    public List<Ordenes> findAll() {
        List<Ordenes> listaOrdenes;
        try {
            iniciaOperacion();
            listaOrdenes = getSesion().createQuery("from Ordenes").list();
        } finally {
            getSesion().close();
        }

        return listaOrdenes;
    }

    @Override
    public List<Ordenes> findByOther(String o) {
        List<Ordenes> listaOrdenes;
        try {
            iniciaOperacion();
            listaOrdenes = getSesion().createQuery("from Ordenes").list();
        } finally {
            getSesion().close();
        }

        return listaOrdenes;
    }
}
