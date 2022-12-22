package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsDAO;
import com.example.lesson02.model.UesdGoods;

@Service // 로직이 들어있겠구나 라는 사인
public class UsedGoodsBO {
	
	@Autowired // spring bean을 주입 받음(Dependency Injection) _ spring bean을 new대신 가져온다.
	private UsedGoodsDAO usedGoodsDAO;
	
	// input : X (controller가 아무것도 주지않음)
	// output: List<UsedGoods>
	public List<UesdGoods> getUesdGoodsList() {
		return usedGoodsDAO.selectUsedGoodsList();
	}
	
}
