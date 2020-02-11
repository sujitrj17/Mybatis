package com.MybatisDemo.myBatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MybatisDemo.myBatis.exceptionHandling.StudentNotFoundException;
import com.MybatisDemo.myBatis.mapper.StudentMapper;
import com.MybatisDemo.myBatis.model.Student;
import com.MybatisDemo.myBatis.service.StudentService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	StudentMapper mapper;
//	StudentService service;
	
	@GetMapping("/getAll")
	public List<Student> getAll() throws StudentNotFoundException{
		System.out.println("entereed");
		List<Student> lst = mapper.findAll();
		if(lst==null) {
			throw new StudentNotFoundException("Student are  not available");
		}
		
		return mapper.findAll();
	}
	@GetMapping("/getOne/{id}")
	public Student getOne(@PathVariable Integer id) throws StudentNotFoundException{
		System.out.println("get One");
		Student lst = mapper.getOne(id);
		if(lst==null) {
			throw new StudentNotFoundException("Student with id "+ id +" is not available");
		} 
		
		return lst;
	}
	
	@PostMapping("/addStudent")
	public String insert(@RequestBody Student stu) {
		System.out.println("inserted data -------------->"+stu);
		
		mapper.addStudent(stu);
		
		return "student added succesfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStu(@PathVariable int id) {
		mapper.deleteStu(id);
		return "Student with id-"+id+" is deleted";
	}

}
