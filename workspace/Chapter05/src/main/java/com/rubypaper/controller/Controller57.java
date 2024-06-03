package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.BookDTO;

@Controller
public class Controller57 {
	@PostMapping("/controller57")
	public String userform(BookDTO bookDTO, Model model) {
		model.addAttribute("head","springboot!!!");
		System.out.println("--------------------------");
		System.out.println(bookDTO.getUserTitle());
		System.out.println(bookDTO.getUserAuthor());
		System.out.println(bookDTO.getUserPublisher());
		System.out.println(bookDTO.getUserPrice());
		System.out.println("--------------------------");
		return "/post/view57";
	}
}
