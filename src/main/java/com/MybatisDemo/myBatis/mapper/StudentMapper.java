package com.MybatisDemo.myBatis.mapper;

import java.util.List;

import com.MybatisDemo.myBatis.model.Student;


public interface StudentMapper {

	List<Student> findAll();

	void addStudent(Student stu);

	void deleteStu(int id);

	Student getOne(Integer id); 
}
