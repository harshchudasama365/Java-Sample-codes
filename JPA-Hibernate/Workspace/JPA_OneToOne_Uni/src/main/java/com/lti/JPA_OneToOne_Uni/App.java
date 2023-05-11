package com.lti.JPA_OneToOne_Uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "---------One to one -----unidirectional" );
        Employee e1 = new Employee();
        e1.setEid(201);
        e1.setEname("Jay J.");
        e1.setSal(20000);
        
        Account a1 = new Account();
        a1.setAccno(5689);
        a1.setBname("ICICI");
        a1.setAccbal(23000);
        
        //setting account for employee
        e1.setAccount(a1);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
        
        Employee emp_find = em.find(Employee.class, 201);
        System.out.println("Employee Name :"+emp_find.getEname());
        System.out.println("Employee Account No :"+emp_find.getAccount());
        
    }
}
