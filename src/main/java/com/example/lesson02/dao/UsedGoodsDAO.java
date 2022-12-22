package com.example.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.model.UesdGoods;

@Repository // 저장소에 가깝다
public interface UsedGoodsDAO {
	
	// input : X (service(BO)가 아무것도 주지않음)
	
	// output: List<UesdGoods>
	public List<UesdGoods> selectUsedGoodsList();
	
}
