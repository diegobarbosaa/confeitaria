package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    
    public Connection getConnection() {
                
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/confeitaria", "root", "");           
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
     
    }
    
}
