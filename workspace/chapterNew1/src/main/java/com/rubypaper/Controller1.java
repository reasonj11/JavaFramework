package com.rubypaper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
	@GetMapping("/userinfo")
	public String userinfo() {
		return"/user/userinfo";
	}
	//데이타 전달요청
	@GetMapping("/userdata")
	public String userdata(Model model) {//데이타주머니
		model.addAttribute("name","이순신");
		model.addAttribute("history","나의 죽음을 적에게 알리지 마라");
		return "/user/userdata";
	}
	@GetMapping("/userid")
	public String userid(@RequestParam String id, Model model) {
		model.addAttribute("id",id);
		return "/user/userid";
	}
}
