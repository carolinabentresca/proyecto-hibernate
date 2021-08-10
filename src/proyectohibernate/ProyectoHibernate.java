/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohibernate;

import Modelo.PersonalOperaciones;



public class ProyectoHibernate {

   
    public static void main(String[] args) {
        
        PersonalOperaciones personal = new PersonalOperaciones();
        personal.listarPersonal();
    }
    
}
