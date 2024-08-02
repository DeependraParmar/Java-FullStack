package lib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryBuilder {
    private static SessionFactory sessionFactory = null;

    public static void buildFactory(){
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }

    public static void closeFactory(){
        sessionFactory.close();
    }
}