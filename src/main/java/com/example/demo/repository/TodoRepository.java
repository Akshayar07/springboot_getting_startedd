package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.modal.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}