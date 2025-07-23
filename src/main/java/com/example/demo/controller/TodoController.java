package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Todo;

@RestController
public class TodoController {
    private final List<Todo> todos = new ArrayList<>();

    @PostMapping("/addtodo")
    public Todo addTodo(@RequestBody Todo todo) {
        todos.add(todo);
        return todo;
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todos;
    }
}
