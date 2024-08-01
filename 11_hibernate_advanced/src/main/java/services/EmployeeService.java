package services;

import entity.Employee;
import lib.SessionFactoryBuilder;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeService {
    public List<Employee> getAllEmployee(){
        Session session = null;
        try {
            session = SessionFactoryBuilder.getSession();
            Query<Employee> query = session.createQuery("from Employee", Employee.class);
            return query.list();
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

    public void updateEmployee(Employee ob){
        Session session = null;
        try {
            session = SessionFactoryBuilder.getSession();
            session.update(ob);
            session.beginTransaction().commit();
            System.out.println("Employee Updated Successfully ....");
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            assert session != null;
            session.close();
        }
    }
}
