package services;

import entity.Employee;
import lib.SessionFactoryBuilder;
import org.hibernate.Session;

public class EmployeeService {
    public void addEmployee(Employee ob){
        Session session = null;
        try {
            session = SessionFactoryBuilder.getSession();
            session.save(ob);
            session.beginTransaction().commit();

            System.out.println("Employee Added Successfully .....");
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            assert session != null;
            session.close();
        }
    }

    public Employee getById(int id){
        Session session = null;
        try {
            session = SessionFactoryBuilder.getSession();
            return session.get(Employee.class, id);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        finally {
            assert session != null;
            session.close();
        }
    }
}
