package com.example.todolist.domain.todo

import com.example.todolist.data.entity.ToDoEntity
import com.example.todolist.data.repository.ToDoRepository
import com.example.todolist.domain.UseCase

class InsertToDoListUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {
    suspend operator fun invoke(toDoList: List<ToDoEntity>) {
        return toDoRepository.insertToDoList(toDoList)
    }
}