package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

@RestController
public class SecondController {
	
	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardlist() {
		List<BoardVO> boardlist = new ArrayList<BoardVO>();
		for(int i = 1; i <= 10; i++) {
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitle("title"+i);
			board.setWriter("kimmaldong: "+i);
			board.setContent("greeting"+i);
			board.setCreateDate(new Date());
			board.setCnt(0);
		boardlist.add(board);	
		}
		return boardlist;
	}
	
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("title");
		board.setWriter("kimmaldong");
		board.setContent("greeting");
		board.setCreateDate(new Date());
		board.setCnt(0);
		
		return board;
	}
	
	//요청패스
	@GetMapping("/hi")
	public String hi() {
		return "hi ~.~";
	}

	@GetMapping("/yuhan")
	public String yuhan() {
		return "유한 화이팅!!";
	}
	
	@GetMapping("/birth")
	public String birth(String s) {
		return "나는 생일선물로 "+s+" 받고 싶어~~!";
	}
	
	@GetMapping("/선물")
	public String 선물() {
		return "선량한 마음씨를 닦읍시다용~";
	}
}

