package jdbc_real_02;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

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

    public Student getByRoll(int rollno) {
        Student student = null;

        // try with resource for AutoCloseable
        try(Connection connection = DBConnection.getDBConnection()) {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("select * from student where rollno=" + rollno);

            if(rs.next()){
                int roll = rs.getInt("rollno");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                float marks = rs.getFloat("marks");

                student = new Student(roll, name, age, email, marks);
            }


            return student;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void addStudent() {
        try(Connection connection = DBConnection.getDBConnection()){
            int roll, age;
            String name, email;
            float marks;

            Scanner sc = new Scanner(System.in);

            System.out.print("Your roll no: " );
            roll = sc.nextInt();
            System.out.print("Your name: " );
            name = sc.next();
            System.out.print("Your age: " );
            age = sc.nextInt();
            System.out.print("Your email: " );
            email = sc.next();
            System.out.print("Your marks: " );
            marks = sc.nextFloat();

            PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?,?);");
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, email);
            ps.setFloat(5, marks);

            ps.executeUpdate();
            System.out.println("Student Added Successfully......");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
