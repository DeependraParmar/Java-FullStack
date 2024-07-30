package jdbc_real_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Aim: provide a Connection whenever the static method is called
public class DBConnection {
    public static Connection getDBConnection() throws SQLException {
        final String CONNECTION_URL = "jdbc:mysql://localhost/javadb";
        final String ID = "root";
        final String PASSWORD = "root";

        Connection connection = DriverManager.getConnection(CONNECTION_URL, ID, PASSWORD);
        System.out.println("Connected to Database....");

        return connection;
    }
}
