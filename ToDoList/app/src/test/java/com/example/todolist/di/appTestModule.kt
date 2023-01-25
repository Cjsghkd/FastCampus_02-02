package com.example.todolist.di

import com.example.todolist.data.repository.TestToDoRepository
import com.example.todolist.data.repository.ToDoRepository
import com.example.todolist.domain.todo.GetToDoListUseCase
import com.example.todolist.domain.todo.InsertToDoListUseCase
import com.example.todolist.presentation.list.ListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val appTestModule = module {

    // ViewModel
    viewModel { ListViewModel(get()) }

    // UseCase
    factory { GetToDoListUseCase(get()) }
    factory { InsertToDoListUseCase(get()) }

    // Repository
    single<ToDoRepository> { TestToDoRepository() }

}