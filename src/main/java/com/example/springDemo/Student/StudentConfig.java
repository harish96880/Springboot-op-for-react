//package com.example.springDemo.Student;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student sriharish = new Student("Sriharish", "sriharishoffl@gmail.com", age: 20);
//            Student varun = new Student(name: "Sedhushree", email: "sedhushree@gmail.com", age: 20);
//            repository.saveAll(List.of(sriharish, varun));
//        };
//
//    }
//}
