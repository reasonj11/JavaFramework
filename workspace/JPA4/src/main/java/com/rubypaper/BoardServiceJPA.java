package com.rubypaper;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Service
public class BoardServiceJPA implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("JPA4");
		EntityManager em = emf.createEntityManager();	
		//insert
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		
		Board board = new Board();	
	    board.setTitle("jpatitle3");
	    board.setWriter("kim uhan3");
	    board.setContent("jpa content3");
	    board.setCreateDate(new Date());
		board.setCnt(0);
		
		em.persist(board);
		//순서가 중요하다.
		tx.commit();
		em.close();
		emf.close();
	}	
}
