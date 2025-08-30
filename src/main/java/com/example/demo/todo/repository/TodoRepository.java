package com.example.demo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.todo.modal.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}