package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
   Connection con;

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://monorail.proxy.rlwy.net:19642/railway?currentSchema=PI2", "postgres", "6aDAbeE6D6gd5*DBB*Ba1EadBd*D5G*a");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se pudo establecer conexión con la BD. Error: " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }   
}
