package com.example.demo.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.todo.modal.Todo;
import com.example.demo.todo.repository.TodoRepository;

@Service
public class TodoService {
    private final TodoRepository repo;

    public TodoService(TodoRepository repo) {
        this.repo = repo;
    }

    public Todo addTodo(Todo todo) {
        return repo.save(todo);
    }

    public List<Todo> getAllTodos() {
        return repo.findAll();
    }

    public Todo updateTodo(int id, Todo updatedTodo) {
        Todo todo = repo.findById(id).orElseThrow(() -> new RuntimeException("Todo with id " + id + " not found"));
        todo.setTitle(updatedTodo.getTitle());
        todo.setDone(updatedTodo.isDone());
        return repo.save(todo);
    }

    public void deleteTodo(int id) {
        repo.deleteById(id);
    }
}
