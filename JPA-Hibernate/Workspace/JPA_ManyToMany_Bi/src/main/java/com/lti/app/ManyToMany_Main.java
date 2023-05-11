package com.lti.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.entity.Order;
import com.lti.entity.Product;

public class ManyToMany_Main {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setPid(11);
		p1.setPname("prod-1");
		
		Product p2 = new Product();
		p2.setPid(12);
		p2.setPname("prod-2");
		
		Order o1 = new Order();
		o1.setOid(101);
		o1.setOname("order-1");

		Order o2 = new Order();
		o2.setOid(102);
		o2.setOname("order-2");
		
		//p1 product belongs to two orders(Order-1 & order-2)
		List<Order> olist1 = new ArrayList<>();
		olist1.add(o1);
		olist1.add(o2);
		p1.setOrder_list(olist1);
		
		//p2 belongs to only one order i.e order-2
		List<Order> olist2 = new ArrayList<>();
//		olist1.add(o1);
		olist2.add(o2);
		p2.setOrder_list(olist2);
		
		//Product-list setting to order-1
		List<Product> plist1 = new ArrayList<>();
		plist1.add(p1);
		o1.setProdlist(plist1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
		
		//Order can access the Product
		System.out.println("Order can access the product details");
		Order order = em.find(Order.class, 102);
		List<Product> plist = order.getProdlist();
		for(Product p: plist) {
			System.out.println("Product Name : "+p.getPname());
		}
		
		//Product can access the order
		System.out.println("Product can access order details");
		Product prod = em.find(Product.class, 11);
		List<Order> olist = prod.getOrder_list();
		for(Order o: olist) {
			System.out.println("Print Order Name : "+o.getOname());
		}
	}

}
