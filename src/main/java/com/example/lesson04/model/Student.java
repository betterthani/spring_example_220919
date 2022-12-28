package com.example.lesson04.model;

import com.example.lesson01.Data;

public class Student {
	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	private String dreamjob;
	private Data createdAt;
	private Data updatedAt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDreamjob() {
		return dreamjob;
	}
	public void setDreamjob(String dreamjob) {
		this.dreamjob = dreamjob;
	}
	public Data getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Data createdAt) {
		this.createdAt = createdAt;
	}
	public Data getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Data updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
