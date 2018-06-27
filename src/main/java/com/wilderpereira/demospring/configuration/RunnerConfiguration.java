package com.wilderpereira.demospring.configuration;

import com.wilderpereira.demospring.domain.Student;
import com.wilderpereira.demospring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class RunnerConfiguration {

    @Bean
    ApplicationRunner init(StudentRepository studentRepository) {
        return args -> {
            List<Student> mockStudents = Arrays.asList(
                    new Student("Wilder", 20),
                    new Student("Everton", 20),
                    new Student("Murilo", 20),
                    new Student("Vinícius", 20),
                    new Student("André", 20),
                    new Student("Kleber", 20),
                    new Student("JC", 20)
            );
            studentRepository.saveAll(mockStudents);
            System.out.println(studentRepository.findAll());
        };
    }

}
