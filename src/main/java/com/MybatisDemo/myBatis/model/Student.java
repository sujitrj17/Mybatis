package com.MybatisDemo.myBatis.model;

public class Student {

	private Long id;
	private String name;
	private String passportNo;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passportNo=" + passportNo + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	
}
