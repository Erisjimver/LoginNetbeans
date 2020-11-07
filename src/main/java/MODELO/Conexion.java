package MODELO;


import java.sql.*;



public class Conexion {
    
Connection conexion=null;
static Statement s;
static ResultSet rs;

public Connection conexion(){
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");    
            String BaseDeDatos = "jdbc:mysql://biyxm0rsazozhfw3mbhg-mysql.services.clever-cloud.com:3306/biyxm0rsazozhfw3mbhg";
            String usuario ="un6zuakjyq0bgrue";
            String contrasena="tqPh8MgV12ADypjqXqRm";
            conexion = DriverManager.getConnection(BaseDeDatos,usuario,contrasena);
                
            if (conexion != null) {
                System.out.println("Conectando a Base de Datos...");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion");
        }
        return conexion;    
}

public ResultSet consultar(String sql) { 
        try { 
            s = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            rs = s.executeQuery(sql); 
             
        } catch (SQLException e) { 
            return null; 
        } 
        return rs; 
    }
}
