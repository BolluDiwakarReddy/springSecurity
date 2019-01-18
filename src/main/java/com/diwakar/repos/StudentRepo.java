package com.diwakar.repos;

import org.springframework.data.repository.CrudRepository;

import com.diwakar.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
