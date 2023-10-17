
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Connection");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: "+e);
        }
            
    }
    
    public Connection getConnection(){
        return con;
    }
}
