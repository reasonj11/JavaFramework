package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.Friend;

@Controller
public class Controller5 {
	@GetMapping("/form5")
	public String insertFriend(Model model) {
		model.addAttribute("friend",new Friend());
		return "/post/form5";
	}
	@PostMapping("/view5")
	public String friendview(Friend friend, Model model) {
		model.addAttribute("heading","friend information");
		return "/post/view5";
	}
}
