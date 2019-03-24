/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisandra.test;

import lisandra.dao.personasDAO;
import lisandra.domain.Usuario;

/**
 *
 * @author USUARIO
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personasDAO dao=new personasDAO();
        
        Usuario user=new Usuario("Cristian",12);
        dao.save(user);
    }
    
}
