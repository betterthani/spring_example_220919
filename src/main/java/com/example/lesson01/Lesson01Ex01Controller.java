package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller // 스프링빈(spring bean(객체)) : 요청받는 객체를 생성하겠다
public class Lesson01Ex01Controller {
	
	// String 출력하기 - content type HTML
	// 생성할 주소 : http://localhost:8080/lesson01/ex01/1
	@ResponseBody // 응답 값을 받는 곳(리턴값 들어오는 곳, 리턴되는 값을 HTML Response body에 넣어 보낸다.)
	@RequestMapping("/1") // 주소 매핑
	public String printString() {
		String text = "예제1번 <br> 문자열을 response body로 보내는 예제";
		return text;
	}
	
	// Map 출력하기
	// http://localhost:8080/lesson01/ex01/2
	
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> printMap() {
		// {"aaaa"=1111} : java의 map / {"aaaa":1111} : json
		Map<String,Object> map = new HashMap<>();
		map.put("aaaaa", 1111);
		map.put("bbbbb", 1111);
		map.put("ccccc", 2222);
		map.put("ddddd", 3333);
		
		// spring web starter 때문에 jackson이라는 라이브러리가 포함 되어있음
		return map; // map을 리턴하면 JSON으로 나타난다.
	}
	
	
}
