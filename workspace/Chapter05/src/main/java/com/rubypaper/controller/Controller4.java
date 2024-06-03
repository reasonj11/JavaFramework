package com.rubypaper.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO;

public class Controller4 {
	@GetMapping("/form4")
	public String getmain() {
		return "/post/form4";
	}
	@PostMapping("/view4") //객체달고 넘김
	public String postmain(UserDTO userDTO, Model model) {
		model.addAttribute("heading", "odject 전달");
		System.out.println("--------------------------");
		System.out.println("userName: " + userDTO.getUserName());
		System.out.println("userId: " + userDTO.getUserId());
		System.out.println("userPhone: " + userDTO.getUserPhone());
		System.out.println("--------------------------");
		return"/post/view4";
	}
}
