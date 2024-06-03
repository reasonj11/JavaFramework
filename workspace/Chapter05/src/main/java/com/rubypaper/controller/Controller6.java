package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.dto.BoardDTO;

@Controller
public class Controller6 {
	@GetMapping("/view6")
	public String mainPage(Model model) {
		BoardDTO b1 = new BoardDTO(1,"boardDTO 객체입니다.", "홍길동");
		BoardDTO b2 = new BoardDTO(2,"하늘이 무척 맑은 날씨네요..", "이순신");
		BoardDTO b3 = new BoardDTO(3,"요즘 무척 더웠죠?", "김말동");
		BoardDTO b4 = new BoardDTO(4,"다들 휴가는 가셨는지요?", "김씨");
		BoardDTO b5 = new BoardDTO(5,"에어컨 넘 좋아용.", "이상우");
		BoardDTO b6 = new BoardDTO(6,"전기료 폭탄!!.", "이산");
		List<BoardDTO> bList = new ArrayList<BoardDTO>();
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);
		bList.add(b5);
		bList.add(b6);
		model.addAttribute("boardDTO", b1);
		model.addAttribute("bList", bList);
		return "/post/view6";
	}
}
