# proyecto-hibernate

# TEMA : Hibernate-List

#PROYECTO JAVA : Java Application

#CARPETA "src" :
  
  - hibernate.cfg.xml :   Genera la conexion a la base de datos "Personal".
  
  - hibernate.reveng.xml :   Agregamos la tabla "personal", de la base de datos.
  
#PAQUETE "Dao" : 

   - Personal.hbm.xml :   Genera la config de la clase "Dao.Personal".
  
  - CLASE "Personal" :   Genera el POJO, clase de la tabla "personal".
  
#PAQUETE "Modelo" :   
  
  - CLASE "HibernateUtil" :   Configura SessionFactory.
  
  - CLASE "PersonalOperaciones" :   Crea un SessionFactory y realiza el metodo
          "listarPersonal()".
  
#PAQUETE "proyectohibernate" : 
  
  - CLASE "ProyectoHibernate" :   Clase main, se instancia la clase "PersonalOperaciones"
           y se ejecuta el proyecto.
   
  
