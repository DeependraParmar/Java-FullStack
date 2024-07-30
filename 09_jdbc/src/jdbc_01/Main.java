package jdbc_01;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        final String CONNECTION_URL = "jdbc:mysql://localhost/javadb";
        final String ID = "root";
        final String PASSWORD = "root";

        try{
            // CONNECTION BUILD: Making a connection with the database using JDBC
            Connection connection = DriverManager.getConnection(CONNECTION_URL, ID, PASSWORD);
            System.out.println("Connected to Database....");
            System.out.println();

            // STATEMENT BUILD: If you want to execute a query, you need Statement Class in JDBC
            Statement statement = connection.createStatement();

            // EXECUTING QUERY: Executing the Query using Statement.
            ResultSet resultSet = statement.executeQuery("select * from student");

            // PRINTING RECORDS: Printing the rows
            while(resultSet.next()){
                // accessing columns via number of column: Not a great choice
//                int rollno = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                int age = resultSet.getInt(3);
//                String email = resultSet.getString(4);
//                float marks = resultSet.getFloat(5);

                int rollno = resultSet.getInt("rollno");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");
                float marks = resultSet.getFloat("marks");

                System.out.println(rollno + " " + name + " " + age + " " + email + " " + marks);
            }
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