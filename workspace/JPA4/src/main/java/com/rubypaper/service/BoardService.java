package com.rubypaper.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.rubypaper.persistence.BoardDAO;
@Service
public class BoardService implements ApplicationRunner {
	@Autowired
	private BoardDAO boarddao;
	@Override
	public void run(ApplicationArguments args) throws Exception { 
		Map<String, Object> board =new HashMap<String, Object>(); 
		board.put("title", "springBoot jdbc test");
		board.put("writer", "0");
		board.put("content", "first testing~~!!");
		List<Map<String, Object>> boardList =boarddao.getBoard(); 
		for(Map<String, Object> result:boardList) {
			System.out.println("----> "+result.toString());
	}
	}//run
}//BoardService