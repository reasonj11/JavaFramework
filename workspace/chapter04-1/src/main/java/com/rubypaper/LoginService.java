package com.rubypaper;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Service
public class LoginService implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("chapter04-1");
		EntityManager em = emf.createEntityManager();	
		Login findlogin = em.find(Login.class, 1);
		System.out.println("검색결과값: "+findlogin.toString());
		/*Login login = new Login();
		
		Login findLogin = em.find(Login.class, 1);
		System.out.println("검색결과: "+findLogin.toString());
		
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		findLogin.setPw("a11");
		tx.commit();
		System.out.println("검색결과: "+findLogin.toString());*/
		em.close();
		emf.close();
	}	
}

