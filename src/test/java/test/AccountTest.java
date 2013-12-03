package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

    public void testAccount() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("account");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        final Query q = em.createNativeQuery("CREATE TABLE Account (id INT, name VARCHAR(60))");
        q.executeUpdate();
        final Query query = em.createNativeQuery("INSERT INTO Account (name) VALUES ('kowser')");
        query.executeUpdate();
        // Account a = new Account("Bob");
        // em.persist(a);
        et.commit();
        // System.out.println("a" + a.getId());
    }
}