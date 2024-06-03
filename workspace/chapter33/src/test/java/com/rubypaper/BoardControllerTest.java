package com.rubypaper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//컨트롤러 어노테이션만 목업함
@WebMvcTest//가짜 톰켓(가짜 컨테이너) 생성
public class BoardControllerTest {
	//멤버 하나가 필요
	@Autowired
	private MockMvc mockMvc;
	
	@Test//JUint test생성에 꼭 사용
	public void testMocMvcTest() throws Exception {
		//mockMvc.perform(get("/hello").param("name", "gildong"))
		//.andExpect(status().isOk())
		//.andExpect(content().string("hello:gildong"))
		//.andDo(print());
	}
}
