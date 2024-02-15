package lk.ijse;

import com.sun.jdi.PathSearchingVirtualMachine;
import jakarta.persistence.Query;
import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        transaction.commit();
        session.close();
    }
}
