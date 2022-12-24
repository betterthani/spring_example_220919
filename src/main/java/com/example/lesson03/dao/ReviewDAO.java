package com.example.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReview(int id); // 비오꺼 복붙해서 메소드명만 select로 변경
}
