package com.example.demo.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
                new Student("Akshaya", 22),
                new Student("Akshaya", 26),
                new Student("Priya", 21));
    }

}
