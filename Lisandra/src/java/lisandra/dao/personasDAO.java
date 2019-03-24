/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisandra.dao;

import java.util.List;
import lisandra.domain.Usuario;
import lisandra.utils.HibernateUtil;
import org.hibernate.HibernateException;

/**
 *
 * @author USUARIO
 */
public class personasDAO extends HibernateUtil implements IBaseDAO <Usuario, Integer> {

    @Override
    public void save(Usuario o) {
        try{
            iniciaOperacion(); // iniciar util
            getSesion().save(o);
            getTransac().commit();
        }catch(HibernateException he){
            manejaExcepcion(he); //util
            throw he;
        }finally{
            getSesion().close(); //util
        }
    }

    @Override
    public Usuario merge(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario finById(Integer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
