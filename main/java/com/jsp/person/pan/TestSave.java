package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("karuna");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Person person = new Person();
	person.setName("las");
	person.setEmail("Lasg@gmail.com");
	
	Pan pan = new Pan();
	pan.setGst_number("xyz@123");
	entityTransaction.begin();
	entityManager.persist(person);
	entityTransaction.commit();
	
	}
}
