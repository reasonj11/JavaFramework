package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import com.rubypaper.persistence.BoardDAO;
import com.rubypaper.service.BoardService;

@SpringBootTest(properties = {"author.name=kimmaldong",
								"author.age=33",
								"author.nation=USA"},
				classes= {BoardService.class,BoardDAO.class})
public class ProperiesTest {
	//@Value("${author.name}")
	//private String name;
	//@Value("${author.age}")
	//private int age;
	@Autowired //모든 변수 값을 다 가지고 있어서 간단하다
	private Environment env;
	@Test
	public void testMethod() {
		//System.out.println("name : "+name);
		//System.out.println("age : "+age);
		System.out.println("이름: "+env.getProperty("author.name"));
		System.out.println("나이: "+env.getProperty("author.age"));
		System.out.println("국적: "+env.getProperty("author.nation"));
	}
}
