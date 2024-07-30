package jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        final String CONNECTION_URL = "jdbc:mysql://localhost/javadb";
        final String ID = "root";
        final String PASSWORD = "root";

        try{
            Connection connection = DriverManager.getConnection(CONNECTION_URL, ID, PASSWORD);
            System.out.println("Connected to Database....");
        }
        catch(SQLException e){
            System.out.println("Error Connecting to Database....");
            System.err.println(e.getMessage());
        }
    }
}

/*
    For using a database, we need a connectivity between the java program and
    mysql. For connectivity, we will be using Java DataBase Connectivity.

    All this has been provided in java.sql and in order to communicate between
    MySql and JDBC, we need MYSQL provided JAR ( Java Archive ).

    This JAR has collection of multiple classes and contains the interfaces for
    communication.


    ***** Step 01: Created the schema in MYSQL using Workbench, inserted some records
    ***** Step 02: Setup JDBC using MYSQL Connection JAR, which need to be downloaded
                    from MYSQL's official website.
    ***** Step 03: Put the JAR Connector, add it to dependencies
    ***** Step 04: Create connection and start working with it.
*/