package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.model.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
	
	@Autowired
	private StudentBO studentBO;
	
	// 학생 추가 화면
	// http://localhost/lesson04/ex02/add_student_view
	@GetMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	// 뷰화면으로 체인지
	@PostMapping("/add_student")
	public String addStudent(
			// 여러개의 것을 사용할때 어노테이션 반드시 붙이고 단일개일 경우 생략 가능
			@ModelAttribute Student student) { // name(request param)과 필드명이 일치하는 것이 담긴다.
		
		// DB insert
		studentBO.addStudent(student);
		
		// DB select (방금 가입된 사람)
		
		// view페이지(응답값) 이동
		return "lesson04/afterAddStudent";
		
	}
}
