package com.example.todolist.domain.todo

import com.example.todolist.data.entity.ToDoEntity
import com.example.todolist.data.repository.ToDoRepository
import com.example.todolist.domain.UseCase

class GetToDoListUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {
    suspend operator fun invoke(): List<ToDoEntity> {
        return toDoRepository.getToDoList()
    }
}