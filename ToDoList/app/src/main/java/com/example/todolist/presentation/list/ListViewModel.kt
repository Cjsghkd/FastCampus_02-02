package com.example.todolist.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.data.entity.ToDoEntity
import com.example.todolist.domain.todo.GetToDoListUseCase
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

// 필요한 유스케이스
// 1. GetToDoListUseCase
// 2. UpdateToDoUseCase
// 3. DeleteAllToDoItemUseCase

internal class ListViewModel(
    private val getToDoListUseCase: GetToDoListUseCase
): ViewModel() {

    private var _toDoListLiveData = MutableLiveData<List<ToDoEntity>>()
    val toDoListLiveData: LiveData<List<ToDoEntity>> = _toDoListLiveData

    fun fetchData(): Job = viewModelScope.launch {
        _toDoListLiveData.postValue(getToDoListUseCase())
    }

}