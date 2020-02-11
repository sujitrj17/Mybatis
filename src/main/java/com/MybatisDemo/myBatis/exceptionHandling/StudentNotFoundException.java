package com.MybatisDemo.myBatis.exceptionHandling;

public class StudentNotFoundException extends Exception{

	public StudentNotFoundException() {
	super();
	}
	
	public StudentNotFoundException(String msg) {
	super(msg);
	}
}
