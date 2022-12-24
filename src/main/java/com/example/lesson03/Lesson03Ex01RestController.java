package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.BO.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class Lesson03Ex01RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// http://localhost/lesson03/ex01?id=2
	@RequestMapping("lesson03/ex01")
	public Review ex01(
			@RequestParam("id") int id // 필수 파라미터 , 무언가 같이(ex.required) 써야하는 경우 value를 작성해줘야하고 아니면 그냥 id만 적어도된다.
			// @RequestParam(value="id") int id // 필수 파라미터
			// @RequestParam(value="id", required=true) int id // 필수 파라미터
			// @RequestParam(value="id", required=false) Integer id // 비필수 파라미터
			// @RequestParam(value="id", required=false, defaultValue="1") int id // 비필수 파라미터, 디폴값1이므로 null일 수 없다. / defaultValue= String으로 감싸야함
	) { 
//		if(id == null) {
//			return null;
//		} else {
			return reviewBO.getReview(id);
//		}
	}
}
