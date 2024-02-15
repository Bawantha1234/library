package lk.ijse.config;

import lk.ijse.entity.Author;
import lk.ijse.entity.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FactoryConfiguration {


        private static FactoryConfiguration factoryConfiguration;

        private SessionFactory sessionFactory;

        private FactoryConfiguration(){
            org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Author.class).addAnnotatedClass(Books.class);

            sessionFactory =configuration.buildSessionFactory();
        }

        public static FactoryConfiguration getInstance()  {
            return (null == factoryConfiguration) ? factoryConfiguration = new FactoryConfiguration():factoryConfiguration;
        }

        public Session getSession(){

            return sessionFactory.openSession();
        }

    }



