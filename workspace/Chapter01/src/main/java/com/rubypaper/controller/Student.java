package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;
import com.rubypaper.domain.StudentVO;

@RestController
public class Student {

	@GetMapping("/getStudentList")
	public List<StudentVO> getStudentlist() {
		List<StudentVO> studentlist = new ArrayList<StudentVO>();
		for(int i = 1; i <= 3; i++) {
			StudentVO student = new StudentVO();
			student.setSeq(i);
			student.setName("이유진");
			student.setAge(20+i);
			student.setMajor("컴퓨터소프트웨어공학과");
			student.setCreateDate(new Date());
			student.setCnt(0);
		studentlist.add(student);	
		}
		return studentlist;
	}
	
	@GetMapping("/getStudent")
	public StudentVO getStudent() {
		StudentVO student = new StudentVO();
		student.setSeq(1);
		student.setName("kimmaldong");
		student.setAge(22);
		student.setMajor("컴퓨터소프트웨어공학과");
		student.setCreateDate(new Date());
		student.setCnt(0);
		
		return student;
	}
}
