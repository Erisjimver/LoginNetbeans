
package VISTA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ejecutora {

static Connection conexion=null;
static Statement s;
static ResultSet rs;
    public static void main(String[] args) {
       
        try { 
            String Driver = "com.mysql.cj.jdbc.Driver";
            String BaseDeDatos = "jdbc:mysql://biyxm0rsazozhfw3mbhg-mysql.services.clever-cloud.com:3306/biyxm0rsazozhfw3mbhg";
            String usuario ="un6zuakjyq0bgrue";
            String contrasena="tqPh8MgV12ADypjqXqRm";            
            
            Class.forName(Driver);    
            conexion = DriverManager.getConnection(BaseDeDatos,usuario,contrasena);              
            if (conexion != null) {
                System.out.println("Conectando a Base de Datos...");
            }
            
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println("error de conexion" +e);
        }
     /*   
                try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de MySQL: " + ex);
        }
         */
    }      
                        
}
