/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import cr.ac.una.prograiv.moviestar.domain.Media;
import cr.ac.una.prograiv.moviestar.utils.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Byron
 */
public class MediaDAO extends HibernateUtil implements IBaseDAO<Media, Integer>{

    @Override
    public void save(Media o) {
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
    public Media merge(Media o) {
        try {
            iniciaOperacion();
            o = (Media) getSesion().merge(o);
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
    public void delete(Media o) {
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
    public Media findByOther(Media o) {
        Media media = null;

        try {
            iniciaOperacion();
            media = (Media) getSesion().get(Media.class, (Serializable) o);
        } finally {
            getSesion().close();
        }
        return media;
    }

    @Override
    public List<Media> findAllByOther(String o) {
        List<Media> listaMedia;
        try {
            iniciaOperacion();
            listaMedia = getSesion().createQuery("from media where categoria = "+"'"+o+"'").list();
        } finally {
            getSesion().close();
        }

        return listaMedia;
    }

    @Override
    public List<Media> findAll() {
        List<Media> listaMedia;
        try {
            iniciaOperacion();
            listaMedia = getSesion().createQuery("from media").list();
        } finally {
            getSesion().close();
        }

        return listaMedia;
    }
    
}
