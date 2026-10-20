package com.tcs.SpringJdbcEx.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tcs.SpringJdbcEx.model.Student;
import com.tcs.SpringJdbcEx.repo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo repo;
	
	
	public StudentRepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}


	public void addStudent(Student s) {
		System.out.println("");
		repo.save(s);
		
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
