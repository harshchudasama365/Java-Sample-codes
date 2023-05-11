package com.lti.app;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.entity.MailAddress;
import com.lti.entity.Person;

public class OneToMany_Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setPid(66);
		p1.setPname("Person-1");
		
		MailAddress m1 = new MailAddress();
		m1.setMailid(1);
		m1.setMailadd("h1@gmail.com");
		
		MailAddress m2 = new MailAddress();
		m2.setMailid(2);
		m2.setMailadd("h2@gmail.com");
		
		p1.getMail_list().add(m1);
		p1.getMail_list().add(m2);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		Person person = em.find(Person.class, 66);
		System.out.println("Person Name : "+person.getPname());
		
		Collection<MailAddress> mlist = person.getMail_list();
		
		for(MailAddress mail: mlist) {
			System.out.println("Mail Address : "+mail.getMailadd());
			System.out.println("Mail Id "+mail.getMailid());
		}

	}

}
