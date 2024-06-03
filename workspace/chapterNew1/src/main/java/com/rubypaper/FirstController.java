package com.rubypaper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {
//단순요청
	@GetMapping("/main")
	public String add() {//제약이 없음
		return "/main/main";
	}
	@RequestMapping("/home")
	public String home() {
		return "/post/home";
	}
}
