package com.wilderpereira.demospring.repository;

import com.wilderpereira.demospring.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
