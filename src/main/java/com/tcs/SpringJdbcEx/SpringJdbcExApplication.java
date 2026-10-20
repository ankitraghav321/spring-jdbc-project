package com.tcs.SpringJdbcEx;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tcs.SpringJdbcEx.model.Student;
import com.tcs.SpringJdbcEx.service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);
		System.out.println("HelloWorld");
		
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Ankit");
		s.setMarks(90);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
