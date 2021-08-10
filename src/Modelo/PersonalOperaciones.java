/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Dao.Personal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonalOperaciones {

    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session ss = sf.openSession();
    Transaction tt = ss.beginTransaction();

    //Listar Personal
    public void listarPersonal() {
        Query q = ss.createQuery("from Personal");
        List lista = q.list();
        lista.forEach((ob) -> {
            Personal per = (Personal) ob;
            System.out.println("******DATOS DEL PERSONAL******");
            System.out.println("ID:" + per.getId());
            System.out.println("NOMBRE:" + per.getNombre());
            System.out.println("APELLIDO:" + per.getApellido());
            System.out.println("EMAIL:" + per.getEmail());
            System.out.println("ACTIVIDAD:" + per.getActividad());
            System.out.println();

        });
    }

}
