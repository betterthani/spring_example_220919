package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.model.UesdGoods;

@RestController
public class Lesson02Ex01RestController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO; // 스프링 빈을 DI(주입) 받음
	
	@RequestMapping("/lesson02/ex01")
	public List<UesdGoods> ex01() {
		List<UesdGoods> usedGoodsList = usedGoodsBO.getUesdGoodsList();
		return usedGoodsList; // json
	}
	
	
}
