package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

	public void insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("email") String email
			, @Param("introduce") String introduce);
}