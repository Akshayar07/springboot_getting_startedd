package com.example.demo.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello Akshaya";
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "This is a demo application for learning Spring Boot.";
    }
}
