package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Todo;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TodoController {
    private final List<Todo> todoList = new ArrayList<>();
    private int nextTodoId = 1;

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo todo) {
        todo.setId(nextTodoId++);
        todoList.add(todo);
        return todo;
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodo() {
        return todoList;
    }

    @PutMapping("todos/{id}")
    public Todo updateTodo(@PathVariable int id, @RequestBody Todo updatedTodo) {
        for (Todo todo : todoList) {
            if (todo.getId() == id) {
                todo.setTitle(updatedTodo.getTitle());
                todo.setDone(updatedTodo.isDone());
                return todo;

            }
        }

        throw new RuntimeException("Todo with id " + id + " not found");

    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoList.removeIf(todo -> todo.getId() == id);
    }

}
