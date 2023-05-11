package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA_Utility {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static {
		emf = Persistence.createEntityManagerFactory("JPA-PU");
		
	}
	
	public static EntityManager getEntityManager() {
		if(em == null) {
			em = emf.createEntityManager();
		}
		return em;
	}
}
