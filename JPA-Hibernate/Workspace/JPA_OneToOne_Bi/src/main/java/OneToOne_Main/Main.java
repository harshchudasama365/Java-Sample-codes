package OneToOne_Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.entity.Citizen;
import com.lti.entity.Passport;

public class Main {
	public static void main(String[] args) {
		
		Citizen c1 = new Citizen();
		c1.setCid(3003);
		c1.setCname("Harsh C.");
		
		Passport p1 = new Passport();
		p1.setPno(8976);
		p1.setPtype("International");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		//Associate a citizen to passport 
		p1.setCitizen(c1);
		
		
		//Association a passport to citizen
		c1.setPassport(p1);
		
		em.getTransaction().begin();
		em.persist(p1);
//		em.persist(c1);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		
		//From citizen displaying the passport data
		Citizen citizen = em.find(Citizen.class, 3003);
		System.out.println("Citizen Passport No. : "+citizen.getPassport().getPno());
		
		//From passport displaying the citizen data
		Passport passport = em.find(Passport.class, 8976);
		System.out.println("Citizen Name : "+passport.getCitizen().getCname());
		
		em.getTransaction().commit();
	}

}
