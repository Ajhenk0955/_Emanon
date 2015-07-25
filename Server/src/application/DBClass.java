package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClass{    
    public Connection getConnection() throws ClassNotFoundException, SQLException{       
          Class.forName("com.mysql.jdbc.Driver");
          return DriverManager.getConnection("jdbc:mysql://localhost:8888/mydb","testServer","testServer");
    }
}
