package com.diwakar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.diwakar.entities.Student;
import com.diwakar.repos.StudentRepo;

@Service
public class StudentService {
 
	@Autowired
	StudentRepo studentRepo;
	
	public Iterable<Student> fetch() {
		return studentRepo.findAll();	
	}
	
	public void addStudentDetails(Student student) {
		studentRepo.save(student);
		return ;
	}
	public Optional<Student> findById(int Id) {
		return studentRepo.findById(Id);
	
		
	
	}
	public Student update(Student student) {
		studentRepo.save(student);
		return student;
	}
	public void delete(int id) {
		studentRepo.deleteById(id);
	}
	
}
