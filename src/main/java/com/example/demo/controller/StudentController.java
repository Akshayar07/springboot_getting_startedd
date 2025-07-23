package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> getStudents() {
        return List.of(
                new Student("Akshaya", 22),
                new Student("Akshaya", 26),
                new Student("Priya", 21));
    }

}
