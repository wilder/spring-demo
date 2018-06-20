package com.wilderpereira.demospring.controller;

import com.wilderpereira.demospring.domain.Student;
import com.wilderpereira.demospring.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(path = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = (List<Student>) studentRepository.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


}
