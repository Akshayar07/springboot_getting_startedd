package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Todo;
import com.example.demo.service.TodoService;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo todo) {

        return service.addTodo(todo);
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodo() {
        return service.getAllTodos();
    }

    @PutMapping("todos/{id}")
    public Todo updateTodo(@PathVariable int id, @RequestBody Todo updatedTodo) {
        return service.updateTodo(id, updatedTodo);

    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id) {

        service.deleteTodo(id);
    }

}
