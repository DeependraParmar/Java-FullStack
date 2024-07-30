package jdbc_real_02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentService {

    public ArrayList<Student> listAll() {
        ArrayList<Student> list = new ArrayList<Student>();

        // try with resource for AutoCloseable
        try(Connection connection = DBConnection.getDBConnection()) {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("select * from student");

            while(rs.next()){
                int roll = rs.getInt("rollno");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                float marks = rs.getFloat("marks");

                list.add(new Student(roll, name, age, email, marks));
            }


            return list;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
