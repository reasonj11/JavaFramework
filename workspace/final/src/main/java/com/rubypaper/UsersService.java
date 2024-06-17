package com.rubypaper;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
@Service
public class UsersService implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("final");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Users users = new Users();
		//board.setSeq(3);
		users.setId("lee");
		users.setPw("lee111!");
		users.setPw2("lee111!");
		users.setName("lee");
		users.setEmail("lee@naver.com");
		users.setAddress("Korea");
		users.setPhone("01011111111");
		System.out.println("find 명령 후 상태: "+em.contains(users));
		em.persist(users);
		tx.commit();
		
//		Users findUsers = em.find(Users.class, 1);
//		//friendBoard = em.find(Board.class, 2);
//		System.out.println("------------------------------");
//		System.out.println("찾은 값은: "+findUsers.toString());
//		System.out.println("find 명령 후 상태: "+em.contains(findUsers));
		
		
		
		
		//em.find검색
		//Board findBoard = em.find(Board.class, 1);
		//System.out.println("검색결과값: "+findBoard.toString());
		//em.find검색하기
		//EntityTransaction tx = em.getTransaction();
		//tx.begin();
		//findBoard.setTitle("------titlechange52------");
		//findBoard.setContent("change content52");
		//findBoard.setWriter("김유한");
	
		//삭제하기
		//em.remove(findBoard);
		
		//글 목록 다 출력
		//String jpq1 = "select b from Board b order by b.seq desc";
		//List<Board> Boardlist = em.createQuery(jpq1).getResultList();
		//for(Board board1:Boardlist) {
		//	System.out.println("-------------> "+board1.toString());
		//}
		//tx.commit();
		//System.out.println("수정결과값: "+findBoard.toString());
		
		/*		//insert
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
*/	
		
		em.close();
		emf.close();
	}	
}