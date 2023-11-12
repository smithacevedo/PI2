package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    Connection conEncuesta;
    Connection conUsuarios;
    Connection conAulas;
    Connection conProfesores;
    Connection conAdmin;
    Connection conAmbientes;

    
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/conexion", "root", "");
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("No se pudo establecer conexion con la BD. Error: " + e);
        }
    }

    
    public Connection getConnection(){
        return con;
    }   
}
