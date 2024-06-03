package com.rubypaper;

import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Service
public class LoginServiceJPA implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("chapter04");
		EntityManager em = emf.createEntityManager();	
	
	//insert
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		
		Login login = new Login();	
	    login.setNo(1);
	    login.setId("aaa");
	    login.setPw("aaa");
		
		em.persist(login);
		
		em.close();
		emf.close();
	}	
}
