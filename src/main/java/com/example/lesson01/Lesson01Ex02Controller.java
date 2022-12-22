package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // @RestController 아님에 주의 @ResponseBody 없어야함
public class Lesson01Ex02Controller {
	
	// http://localhost/lesson01/ex02/1
	@RequestMapping("/lesson01/ex02/1") // 주소를 치고 들어가는(request)
	public String ex02 () {
		// ResponseBody가 아닌 상태로 String을 리턴하면
		// ViewResolver에 의해, 리턴된 String 이름의 view 경로를 찾고 화면이 구성된다.
		
		//			   prefix				suffix
		//		    /WEB-INF/jsp/			 .jsp
		// return "/WEB-INF/jsp/lesson01/ex02.jsp";
		return "/lesson01/ex02"; // 응답(response)에 대한 경로
	}
}
