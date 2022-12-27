package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	
	// 회원가입 화면
	// http://localhost/lesson04/ex01/add_user_view -> jsp
	@RequestMapping(path="/add_user_view", method=RequestMethod.GET) // =@RequestMapping("/add_user_view")
	public String addUserView() {
		// 		/WEB-INF/jsp/lesson04/addUser.jsp
		return "lesson04/addUser";
	}
	
	@PostMapping("/add_user") // insert를 하는 부분으로 넘어가기 떄문에 해당 경로 설정
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value= "email", required = false) String email,
			@RequestParam(value = "introduce", required = false) String introduce
			
			) {
		
		// DB insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		return "lesson04/afterAddUser"; // 결과 jsp
	}
	
	// http://localhost/lesson04/ex01/get_last_user_view
	@GetMapping("/get_last_user_view")
	public String getLastUserView() {
		//db select
		
		return "lesson04/getLastUser";
	}
}
