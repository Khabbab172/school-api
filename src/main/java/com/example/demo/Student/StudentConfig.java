package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository studentRepository
    ){
        return args ->{
            // Student mariam = new Student(
            //     "mariam", "mariam.gmail.com", LocalDate.of(2001, Month.OCTOBER, 31));
            // Student alex = new Student(
            //      "alex", "alex.gmail.com", LocalDate.of(2000, Month.OCTOBER, 31));

            // studentRepository.saveAll(List.of(mariam,alex));
        };
    }
}
