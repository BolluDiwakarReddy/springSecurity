package com.diwakar.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diwakar.entities.Student;
import com.diwakar.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
     @Autowired
	StudentService studentService;
	
     @GetMapping(value="/fetchAll")
    public Iterable<Student> fetchAll(){
      return studentService.fetch();
    }
	  @PostMapping(value="/addStudent")
     public void addStudent(@RequestBody Student student) {
    	 studentService.addStudentDetails(student);
    	 
     }
	  @GetMapping(value="/findOne/{id}")
	  public Optional<Student> findbyId(@PathVariable("id") int id) {
		 return studentService.findById(id);
	  }
	  @PutMapping(value="/update")
	  public Student update(@RequestBody Student student) {
		  studentService.update(student);
		  return student;
	  }
	  @DeleteMapping(value="/delete/{id}")
	  public void delet(@PathVariable("id") int id) {
		  studentService.delete(id);
	  }
}
