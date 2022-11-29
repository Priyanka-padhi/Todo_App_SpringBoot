package com.example.todo_app_springboot.repository;

import com.example.todo_app_springboot.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {
}
