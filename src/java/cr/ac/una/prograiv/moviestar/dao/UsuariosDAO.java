/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.dao;

import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import cr.ac.una.prograiv.moviestar.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Byron
 */
public class UsuariosDAO extends HibernateUtil implements IBaseDAO<Usuarios, Integer>{

    @Override
    public void save(Usuarios o) {
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
    public Usuarios merge(Usuarios o) {
        try {
            iniciaOperacion();
            o = (Usuarios) getSesion().merge(o);
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
    public void delete(Usuarios o) {
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
    public Usuarios findById(Integer o) {
        Usuarios usuarios = null;

        try {
            iniciaOperacion();
            usuarios = (Usuarios) getSesion().get(Usuarios.class, o);
        } finally {
            getSesion().close();
        }
        return usuarios;
    }

    @Override
    public List<Usuarios> findAll() {
        List<Usuarios> listaUsuarios;
        try {
            iniciaOperacion();
            listaUsuarios = getSesion().createQuery("from Usuarios").list();
        } finally {
            getSesion().close();
        }

        return listaUsuarios;
    }

    @Override
    public List<Usuarios> findByOther(String o) {
        List<Usuarios> listaUsuarios;
        try {
            iniciaOperacion();
            listaUsuarios = getSesion().createQuery("from Usuarios").list();
        } finally {
            getSesion().close();
        }
        return listaUsuarios;
    }
}
