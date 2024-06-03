package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
	//메소드를 처리함
	public BoardController() {
		System.out.println("---------------->> BoradController 호출했징~");
	}
	@RequestMapping("/hello")
	public @ResponseBody String hello(String name) {
		return name+"님 call me?";
	}
}
